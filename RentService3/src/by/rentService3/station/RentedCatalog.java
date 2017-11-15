package by.rentService3.station;

import by.rentService3.entities.RentUnit;

public class RentedCatalog {
		private static final int DEFAULT_RENTED_CAPACITY = 3;
		private RentUnit[] rentedUnits;
		private int lastIndex;
		
		public RentedCatalog() {
			rentedUnits = new RentUnit [DEFAULT_RENTED_CAPACITY];
			lastIndex = 0;
			}

		public RentUnit[] getRentedUnits() {
			return rentedUnits;
		}

		public void setRentedUnits(RentUnit[] rentedUnits) {
			this.rentedUnits = rentedUnits;
		}

		public int getLastIndex() {
			return lastIndex;
		}

		public void setLastIndex(int lastIndex) {
			this.lastIndex = lastIndex;
		}
		public void addRentedUnit(RentUnit rentUnit) { 
			rentedUnits[lastIndex] = rentUnit;
			lastIndex++;
		}
		public RentUnit getLastRentedUnit() {
			return rentedUnits[lastIndex - 1];
}
}
