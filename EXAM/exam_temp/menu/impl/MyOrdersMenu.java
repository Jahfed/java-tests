package EXAM.exam_temp.menu.impl;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.Order;
import EXAM.exam_temp.enteties.User;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.OrderManagementService;
import EXAM.exam_temp.services.impl.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	private static final String ORDERS_MENU_HEADER = "MY ORDERS:";

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		if (context.getLoggedInUser() != null) {
			printMenuHeader();
			User getLoggedInUser = context.getLoggedInUser();
			printMenuHeader();
			Order[] userOrders = orderManagementService.getOrdersByUserId(getLoggedInUser.getId());
			for (Order order : userOrders) {
				System.out.println(order.toString());
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println(ORDERS_MENU_HEADER);
	}

}
