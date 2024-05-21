package EXAM.exam_temp;

import EXAM.exam_temp.menu.Menu;
import EXAM.exam_temp.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
