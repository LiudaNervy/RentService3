package by.rentService3.station;

import by.rentService3.entities.RentUnit;

public class Catalog {
	private static final int DEFAULT_CAPACITY = 10; // задаем константу
	private RentUnit[] units;
	private int lastIndex;
	
	public Catalog() {
	units = new RentUnit [DEFAULT_CAPACITY];// инициализируем массив чтобы не получить null pointer exception 
			// инициализацию лучше вынести в отдельный метод
	lastIndex = 0;
	}


	public RentUnit[] getUnits() {
		return units;
	}
	
	public int getLastIndex() {
		return lastIndex;
	}

	public void addRentUnit(RentUnit unit) { // в качестве параметра ссылка на rentUnit
		units[lastIndex] = unit;
		lastIndex++;
	}
	public RentUnit getLastRentUnit() {
		return units[lastIndex - 1];
	}
}

