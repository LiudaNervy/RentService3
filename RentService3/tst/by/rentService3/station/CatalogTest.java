package by.rentService3.station;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import by.rentService3.entities.Equipment;
import by.rentService3.entities.RentUnit;

public class CatalogTest {

	private Catalog catalog;
	@Before
	public void initCataog() {
	catalog = new Catalog();
	}
	
	@Test
	public void testCatalogRentUnitNotNull() {
		RentUnit[] units = catalog.getUnits();
		assertNotNull("RentUnit storage was not initialized");
	}
	
	@Test
	public void testAddedRentUnitPresent() {
		Equipment eq = new Equipment ("Equipment1");
		RentUnit unit = new RentUnit();
		unit.setEquipment(eq);
		unit.setHourRate(2.5);
		
		catalog.addRentUnit(unit);
		
		RentUnit[] units = catalog.getUnits();
		RentUnit lastItem = catalog.getLastRentUnit();	
			assertEquals("RentUnit was not added", unit, lastItem);
		}
		
}
