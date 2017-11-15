package by.rentStation3.command.impl;

import java.io.FileNotFoundException;

import by.rentService3.entities.RentUnit;
import by.rentService3.logic.ConsoleStationLogicImpl;
import by.rentService3.logic.FileStationLogicImpl;
import by.rentService3.logic.StationLogic;
import by.rentService3.station.RentedCatalog;
import by.rentStation3.command.StationAction;

public class ViewRentedItemsActionImpl implements StationAction {
	private StationLogic logic1;
	{
		// logic1 = new ConsoleStationLogicImpl();
		logic1 = new FileStationLogicImpl();

	}

	@Override
	public void performAction() throws FileNotFoundException {
		// TODO Auto-generated method stub
		RentedCatalog rentedCatalog = logic1.readRentedCatalog();

		RentUnit[] rentedUnits = rentedCatalog.getRentedUnits();
		for (RentUnit rentedUnit : rentedUnits) {
			if (rentedUnit != null) {
				System.out.println(rentedUnit);
			}
		}
	}

}
