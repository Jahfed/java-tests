package EXAM.exam_temp.services;

import EXAM.exam_temp.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);

	Order[] getOrders();

}
