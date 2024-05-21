package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.User;
import EXAM.exam_temp.menu.Menu;

public class ChangePasswordMenu implements Menu {

	private ApplicationContext context;
	private static final String MENU_HEADER = "CHANGE PASSWORD:";
	private static final String ENTER_OLD_PW_MESSAGE = "Please enter old password:";
	private static final String ENTER_NEW_PW_MESSAGE = "Enter new password:";
	private static final String WRONG_CREDENTIALS_MESSAGE = "Sorry, you entered the wrong credentials.";

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		User loggedInUser = context.getLoggedInUser();
		if (loggedInUser != null) {
			System.out.println(ENTER_OLD_PW_MESSAGE);
			Scanner scOldPasswordInput = new Scanner(System.in);
			String oldPasswordInput = scOldPasswordInput.nextLine();

			if (oldPasswordInput.equals(loggedInUser.getPassword())) {
				System.out.println(ENTER_NEW_PW_MESSAGE);
				Scanner scNewPasswordInput = new Scanner(System.in);
				String newPasswordInput = scNewPasswordInput.nextLine();
				if (newPasswordInput.length() > 3) {

					loggedInUser.setPassword(newPasswordInput);

				}
				scNewPasswordInput.close();
			} else {
				System.out.println(WRONG_CREDENTIALS_MESSAGE);
			}
			scOldPasswordInput.close();

		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println(MENU_HEADER);
	}

}
