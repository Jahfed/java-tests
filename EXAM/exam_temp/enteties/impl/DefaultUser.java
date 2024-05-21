package EXAM.exam_temp.enteties.impl;

import EXAM.exam_temp.enteties.User;

public class DefaultUser implements User {

	private static int nextId = 1;
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

	public DefaultUser() {
		this.id = nextId;
	}

	public DefaultUser(String firstName, String lastName, String password, String email) {
		this.id = nextId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "Email: " + email;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	@Override
	public int getId() {
		return id;
	}

	void clearState() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.password = "";
	}
}
