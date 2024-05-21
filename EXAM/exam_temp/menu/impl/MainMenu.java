package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.menu.Menu;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";

	public static final String NO_OPTION_SELECTED_MESSAGE = "Please select a valid option...";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed."
			+ System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() +
			"6. Customer List";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed."
			+ System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() +
			"6. Customer List";;

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Boolean isUserLoggedIn = (context.getLoggedInUser() != null) ? true : false;
		Scanner scUserChoice = new Scanner(System.in);
		int userChoice = scUserChoice.nextInt();

		switch (userChoice) {
			case 1:
				Menu signUpMenu = new SignUpMenu();
				context.setMainMenu(signUpMenu);
				break;
			case 2:
				Menu signInOutMenu = isUserLoggedIn ? new SignInMenu() : new SignOutMenu();
				context.setMainMenu(signInOutMenu);
				break;
			case 3:
				if (isUserLoggedIn) {
					Menu productCatalog = new ProductCatalogMenu();
					context.setMainMenu(productCatalog);
				}
				break;
			case 4:
				if (isUserLoggedIn) {
					Menu myOrders = new MyOrdersMenu();
					context.setMainMenu(myOrders);
				}
				break;
			case 5:
				if (isUserLoggedIn) {
					Menu settings = new SettingsMenu();
					context.setMainMenu(settings);
				}
				break;
			case 6:
				if (isUserLoggedIn) {
					Menu customerList = new CustomerListMenu();
					context.setMainMenu(customerList);
				}
				break;
			default:
				System.out.println(NO_OPTION_SELECTED_MESSAGE);
				break;
		}
		scUserChoice.close();
	}

	@Override
	public void printMenuHeader() {

		System.out.println((context.getLoggedInUser() != null) ? MAIN_MENU_TEXT_FOR_LOGGED_IN_USER
				: MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);

	}

}
