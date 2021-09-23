package com.qa.garage;

public class Motorbike extends Vehicle{
	boolean kickstart;



	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbike(int numOfWheels, String make, String model, String colour, double engineSize) {
		super(numOfWheels, make, model, colour, engineSize);
		// TODO Auto-generated constructor stub
	}

	public boolean isKickstart() {
		return kickstart;
	}

	public void setKickstart(boolean kickstart) {
		this.kickstart = kickstart;
	}

	@Override
	public String toString() {
		return "Motorbike [kickstart=" + kickstart + ", getNumOfWheels()=" + getNumOfWheels() + ", getMake()="
				+ getMake() + ", getModel()=" + getModel() + ", getColour()=" + getColour() + ", getEngineSize()="
				+ getEngineSize() + "]";
	}

	
	

}
