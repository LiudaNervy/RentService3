package by.rentStation3.command;

import by.rentStation3.command.impl.DefaultActionImpl;
import by.rentStation3.command.impl.ViewCatalogActionImpl;
import by.rentStation3.command.impl.ViewRentedItemsActionImpl;

public class ActionHelper {
	public static StationAction defineAction(int input) {
		StationAction action = new DefaultActionImpl();
		StationAction action1 = new DefaultActionImpl();

		switch (input) {
		case 1:
			action = new ViewCatalogActionImpl();
			break;
		case 2:
			action1 = new ViewRentedItemsActionImpl();
			break;
		default:

		}
		return action;
	}
}
