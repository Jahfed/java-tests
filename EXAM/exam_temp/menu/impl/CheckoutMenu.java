package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.Order;
import EXAM.exam_temp.enteties.User;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.OrderManagementService;
import EXAM.exam_temp.services.impl.DefaultOrderManagementService;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	private static final String CHECK_ORDERS_MESSAGE = "Do you wish to proceed to checkout? Y/n";

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		if (context.getLoggedInUser() != null) {
			User getLoggedInUser = context.getLoggedInUser();
			printMenuHeader();
			Order[] userOrders = orderManagementService.getOrdersByUserId(getLoggedInUser.getId());
			for (Order order : userOrders) {
				System.out.println(order.toString());
			}
			System.out.println(CHECK_ORDERS_MESSAGE);
			Scanner scProceed = new Scanner(System.in);
			String proceedInput = scProceed.nextLine();

			if (proceedInput.equalsIgnoreCase("y") || proceedInput.equalsIgnoreCase("yes")) {
				context.getSessionCart();
			}

			scProceed.close();
		}
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
	}

}
