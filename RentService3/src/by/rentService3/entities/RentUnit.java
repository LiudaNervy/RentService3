package by.rentService3.entities;

public class RentUnit {
	private Equipment equipment;
	private double hourRate;

	public RentUnit() {

	}

	public RentUnit(Equipment equipment, double hourRate) {
		this.equipment = equipment;
		this.hourRate = hourRate;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	public RentUnit getRentUnit() {
		// TODO Auto-generated method stub
		return getRentUnit(); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(hourRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentUnit other = (RentUnit) obj;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		if (Double.doubleToLongBits(hourRate) != Double.doubleToLongBits(other.hourRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RentUnit [equipment=" + equipment + ", hourRate=" + hourRate + "]";
	}
	
}
