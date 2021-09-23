package com.qa.garage;

public class Car extends Vehicle{
	int seats;
	boolean isoFix;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int numOfWheels, String make, String model, String colour, double engineSize) {
		super(numOfWheels, make, model, colour, engineSize);
		// TODO Auto-generated constructor stub
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public boolean isIsoFix() {
		return isoFix;
	}
	public void setIsoFix(boolean isoFix) {
		this.isoFix = isoFix;
	}
	@Override
	public String toString() {
		return "Car [seats=" + seats + ", isoFix=" + isoFix + ", getNumOfWheels()=" + getNumOfWheels() + ", getMake()="
				+ getMake() + ", getModel()=" + getModel() + ", getColour()=" + getColour() + ", getEngineSize()="
				+ getEngineSize() + "]";
	}
	


}
