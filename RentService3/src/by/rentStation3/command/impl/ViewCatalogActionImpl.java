package by.rentStation3.command.impl;

import java.io.FileNotFoundException;

import by.rentService3.entities.RentUnit;
import by.rentService3.logic.ConsoleStationLogicImpl;
import by.rentService3.logic.FileStationLogicImpl;
import by.rentService3.logic.StationLogic;
import by.rentService3.station.Catalog;
import by.rentStation3.command.StationAction;

public class ViewCatalogActionImpl implements StationAction {
private StationLogic logic;
{ 
	//logic = new ConsoleStationLogicImpl();
	logic = new FileStationLogicImpl();
	
	

}
	@Override
	public void performAction() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Catalog catalog = logic.readCatalog();
		
		RentUnit [] units = catalog.getUnits();
		for(RentUnit unit : units) {
			if (unit !=null) {
				System.out.println(unit);
			}
		}
	}

}
