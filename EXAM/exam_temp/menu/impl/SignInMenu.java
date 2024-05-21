package EXAM.exam_temp.menu.impl;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.UserManagementService;
import EXAM.exam_temp.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
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
