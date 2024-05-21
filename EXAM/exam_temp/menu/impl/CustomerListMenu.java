package EXAM.exam_temp.menu.impl;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.UserManagementService;
import EXAM.exam_temp.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	private static final String CUSTOMER_LIST_HEADER = "Customer List:";

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		if (context.getLoggedInUser() != null) {
			printMenuHeader();
			userManagementService.getUsers();
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println(CUSTOMER_LIST_HEADER);
	}

}
