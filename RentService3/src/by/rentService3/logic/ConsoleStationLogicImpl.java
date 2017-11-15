package by.rentService3.logic;

import java.io.FileNotFoundException;

import by.rentService3.entities.Equipment;
import by.rentService3.entities.RentUnit;
import by.rentService3.station.Catalog;
import by.rentService3.station.RentedCatalog;

public class ConsoleStationLogicImpl implements StationLogic{ //создали класс реализующий наш интерфейс

	@Override
	public Catalog readCatalog() {
		// TODO Auto-generated method stub
		Equipment eq1 = new Equipment ("Eq1");
		Equipment eq2 = new Equipment ("Eq2");
		Equipment eq3 = new Equipment ("Eq3");
		Equipment eq4 = new Equipment ("Eq4");
		
		
		RentUnit re1 = new RentUnit (eq1, 2.5);
		RentUnit re2 = new RentUnit (eq2, 2.5);
		RentUnit re3 = new RentUnit (eq3, 2.5);
		RentUnit re4 = new RentUnit (eq4, 2.5);
		
		
		Catalog catalog = new Catalog();
		catalog.addRentUnit(re1);
		catalog.addRentUnit(re2);
		catalog.addRentUnit(re3);
		
		return catalog;
	}

	@Override
	public RentedCatalog readRentedCatalog() throws FileNotFoundException {
		RentedCatalog rentedCatalog = new RentedCatalog();
		
		Equipment eq5 = new Equipment ("Eq5");
		Equipment eq6 = new Equipment ("Eq6");
		Equipment eq7 = new Equipment ("Eq7");
		
		RentUnit re5 = new RentUnit (eq5, 2.5);
		RentUnit re6 = new RentUnit (eq6, 2.5);
		RentUnit re7 = new RentUnit (eq7, 2.5);
		
		rentedCatalog.addRentedUnit(re5);
		rentedCatalog.addRentedUnit(re6);
		rentedCatalog.addRentedUnit(re7);
		return rentedCatalog;
	}

}
