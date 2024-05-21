package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.menu.Menu;

public class SignOutMenu implements Menu {

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		System.out.println("Do you want to sign out? Y/n:");
		Scanner scSignOut = new Scanner(System.in);
		String signOut = scSignOut.nextLine();
		scSignOut.close();

		if (signOut == "y" || signOut == "Y") {
			context.setLoggedInUser(null);
		} else {
			context.getMainMenu();
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("=====SIGN OUT========");
	}

}
