package by.rentService3.station;

import by.rentService3.entities.RentUnit;

public class Catalog {
	private static final int DEFAULT_CAPACITY = 10; // ������ ���������
	private RentUnit[] units;
	private int lastIndex;
	
	public Catalog() {
	units = new RentUnit [DEFAULT_CAPACITY];// �������������� ������ ����� �� �������� null pointer exception 
			// ������������� ����� ������� � ��������� �����
	lastIndex = 0;
	}


	public RentUnit[] getUnits() {
		return units;
	}
	
	public int getLastIndex() {
		return lastIndex;
	}

	public void addRentUnit(RentUnit unit) { // � �������� ��������� ������ �� rentUnit
		units[lastIndex] = unit;
		lastIndex++;
	}
	public RentUnit getLastRentUnit() {
		return units[lastIndex - 1];
	}
}

