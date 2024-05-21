package EXAM.exam_temp.menu.impl;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.ProductManagementService;
import EXAM.exam_temp.services.impl.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {

	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;

	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
	}

}
