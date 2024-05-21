package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.User;
import EXAM.exam_temp.menu.Menu;

public class ChangeEmailMenu implements Menu {

	private ApplicationContext context;
	private static final String MENU_HEADER = "CHANGE EMAIL:";

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		Scanner scEmailInput = new Scanner(System.in);
		String newEmailInput = scEmailInput.nextLine();
		if (newEmailInput.length() > 3) {
			User loggedInUser = context.getLoggedInUser();
			if (loggedInUser != null) {
				loggedInUser.setEmail(newEmailInput);
			}
		}
		scEmailInput.close();
	}

	@Override
	public void printMenuHeader() {
		System.out.println(MENU_HEADER);
	}

}
