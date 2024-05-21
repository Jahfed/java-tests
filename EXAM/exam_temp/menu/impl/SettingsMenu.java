package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.impl.DefaultUser;
import EXAM.exam_temp.menu.Menu;

public class SettingsMenu implements Menu {

	private static final String SETTINGS = "1. Change Password" + System.lineSeparator()
			+ "2. Change Email";

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		DefaultUser currentUser = new DefaultUser();

		printMenuHeader();
		Scanner scUserInput = new Scanner(System.in);
		int userChoise = scUserInput.nextInt();

		switch (userChoise) {
			case 1:
				System.out.println("Your old password:");
				Scanner scOldPassword = new Scanner(System.in);
				String userInputOldPassword = scOldPassword.nextLine();
				if (currentUser.getPassword() == userInputOldPassword) {
					Scanner scNewPassword = new Scanner(System.in);
					String userInputNewPassword = scNewPassword.nextLine();
					if (userInputNewPassword.length() > 3) {
						currentUser.setPassword(userInputNewPassword);
					}
					scNewPassword.close();
				}
				scOldPassword.close();
				break;
			case 2:
				System.out.println("Your old email-address:");
				Scanner scOldEmail = new Scanner(System.in);
				String userInputOldEmail = scOldEmail.nextLine();
				if (currentUser.getEmail() == userInputOldEmail) {
					Scanner scNewEmail = new Scanner(System.in);
					String userInputNewEmail = scNewEmail.nextLine();
					if (userInputNewEmail.length() > 3) {
						currentUser.setEmail(userInputNewEmail);
					}
					scNewEmail.close();
				}
				scOldEmail.close();
				break;
			default:
				break;
		} // end of switch statement

		scUserInput.close();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("Settings Menu");
		System.out.println(SETTINGS);
	}

}
