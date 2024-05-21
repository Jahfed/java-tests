package EXAM.exam_temp.enteties.impl;

import EXAM.exam_temp.enteties.Product;

public class DefaultProduct implements Product {

	private int id;
	private String productName;
	private String categoryName;
	private double price;

	public DefaultProduct() {
	}

	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " Product========\n" + productName + " (" + categoryName + ") | " + price + " dollar";
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}

}
