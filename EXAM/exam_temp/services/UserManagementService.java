package EXAM.exam_temp.services;

import EXAM.exam_temp.enteties.User;

public interface UserManagementService {

	String registerUser(User user);

	User[] getUsers();

	User getUserByEmail(String userEmail);

}
