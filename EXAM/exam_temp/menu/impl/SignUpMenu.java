package EXAM.exam_temp.menu.impl;

import java.util.Scanner;

import EXAM.exam_temp.configs.ApplicationContext;
import EXAM.exam_temp.enteties.impl.DefaultUser;
import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.services.UserManagementService;
import EXAM.exam_temp.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();

		System.out.print("First Name:");
		Scanner scFirstName = new Scanner(System.in);
		String firstName = scFirstName.nextLine();
		scFirstName.close();
		System.out.print("Last Name:");
		Scanner scLastName = new Scanner(System.in);
		String lastName = scLastName.nextLine();
		scLastName.close();
		System.out.print("Email:");
		Scanner scEmail = new Scanner(System.in);
		String email = scEmail.nextLine();
		scEmail.close();
		System.out.print("Password:");
		Scanner scPassword = new Scanner(System.in);
		String password = scPassword.nextLine();
		scPassword.close();

		DefaultUser newUser = new DefaultUser(firstName, lastName, email, password);
		userManagementService.registerUser(newUser);
	}

	@Override
	public void printMenuHeader() {
		System.out.println("=====SIGN UP====");
	}

}
