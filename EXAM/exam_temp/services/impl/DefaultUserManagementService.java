package EXAM.exam_temp.services.impl;

import java.util.ArrayList;
import java.util.List;

import EXAM.exam_temp.enteties.User;
import EXAM.exam_temp.services.UserManagementService;

public class DefaultUserManagementService implements UserManagementService {

	private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
	private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
	private static final String NO_ERROR_MESSAGE = "";
	private static final String USERS_CAPACITY_EXCEEDED_MESSAGE = "System exeeded default users capacity.";
	private static final String NO_USER_SUBMITTED_MESSAGE = "No user submitted.";

	private static final int DEFAULT_USERS_CAPACITY = 10;

	private static DefaultUserManagementService instance;

	private static User[] users;
	private static List<User> usersList = new ArrayList<>();

	private DefaultUserManagementService() {
	}

	@Override
	public String registerUser(User user) {
		if (users.length >= DEFAULT_USERS_CAPACITY) {
			return USERS_CAPACITY_EXCEEDED_MESSAGE;
		}
		if (user != null && users != null) {
			for (User checkUser : users) {
				if (checkUser != null && checkUser.getEmail().equals(user.getEmail())) {
					return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
				}
			}
			if (user.getEmail() == null) {
				return EMPTY_EMAIL_ERROR_MESSAGE;
			}

			usersList.add(user);
			users = usersList.toArray(new User[0]);
			return NO_ERROR_MESSAGE;
		}
		return NO_USER_SUBMITTED_MESSAGE;
	}

	public static UserManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultUserManagementService();
		}
		return instance;
	}

	@Override
	public User[] getUsers() {
		return users.clone();
	}

	@Override
	public User getUserByEmail(String userEmail) {
		if (userEmail != null && users != null) {
			for (User filteredUser : users) {
				if (filteredUser != null && filteredUser.getEmail().equals(userEmail)) {
					return filteredUser;
				}
			}
		}
		return null;
	}

	void clearServiceState() {
		usersList.clear();
		users = new User[0];
	}
}
