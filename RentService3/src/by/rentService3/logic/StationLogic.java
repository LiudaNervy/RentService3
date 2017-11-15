package by.rentService3.logic;

import java.io.FileNotFoundException;

import by.rentService3.station.Catalog;
import by.rentService3.station.RentedCatalog;

public interface StationLogic {
	Catalog readCatalog()  throws FileNotFoundException;
	RentedCatalog readRentedCatalog()  throws FileNotFoundException;
}
