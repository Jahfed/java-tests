package EXAM.exam_temp.services.impl;

import java.util.List;
import java.util.ArrayList;

import EXAM.exam_temp.enteties.Order;
import EXAM.exam_temp.services.OrderManagementService;

public class DefaultOrderManagementService implements OrderManagementService {

	private static final int DEFAULT_ORDER_CAPACITY = 10;

	private static DefaultOrderManagementService instance;

	private static List<Order> ordersList = new ArrayList<>();

	public static OrderManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}

	@Override
	public void addOrder(Order order) {
		if (order != null && ordersList.size() <= DEFAULT_ORDER_CAPACITY) {
			ordersList.add(order);
		}
	}

	@Override
	public Order[] getOrdersByUserId(int userId) {
		if (userId >= 0 && ordersList != null) {
			List<Order> filteredOrdersList = new ArrayList<>();
			for (Order order : ordersList) {
				if (order.getCustomerId() == userId) {
					filteredOrdersList.add(order);
				}
			}
			Order[] filteredOrdersById = filteredOrdersList.toArray(new Order[0]);
			return filteredOrdersById;
		} else {
			return new Order[0];
		}
	}

	@Override
	public Order[] getOrders() {
		if (ordersList != null) {
			Order[] getOrders = ordersList.toArray(new Order[0]);
			return getOrders;
		} else {
			return new Order[0];
		}
	}

	void clearServiceState() {
		ordersList.clear();
	}

}
