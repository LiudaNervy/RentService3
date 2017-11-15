package by.rentService3.runner;

import java.io.IOException;

import by.rentService3.view.ConsoleMenu;
import by.rentStation3.command.ActionHelper;
import by.rentStation3.command.StationAction;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ConsoleMenu.printMenu();
//ConsoleMenu.readUserInput();
 int input = ConsoleMenu.readUserInput();
 
 StationAction action = ActionHelper.defineAction(input);
 action.performAction();
	}
}
