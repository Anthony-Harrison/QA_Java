package com.qa.main;

public class Car {
	private int numOfWheels;
	private String make;
	private String model;
	private String colour;
	double engineSize;

	public Car() {

	}

	public Car(int numOfWheels, String make, String model, String colour, double engineSize) {
		this.numOfWheels = numOfWheels;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineSize = engineSize;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [numOfWheels=" + numOfWheels + ", make=" + make + ", model=" + model + ", colour=" + colour
				+ ", engineSize=" + engineSize + "]";
	}

}
