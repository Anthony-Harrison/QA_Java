package com.qa.garage;

public class Van extends Vehicle{
	private boolean tailLift;
	private int inLength;
	private int inWidth;
	private int inHeight;
	

	public Van() {
		super();

	}
	public Van(int numOfWheels, String make, String model, String colour, double engineSize, int inLength, 
			int inWidth, int inHeight, boolean tailLift) {
		super(numOfWheels, make, model, colour, engineSize);
		this.tailLift = tailLift;
		this.inLength = inLength;
		this.inWidth = inWidth;
		this.inHeight = inHeight;
	}
	public boolean isTailLift() {
		return tailLift;
	}
	public void setTailLift(boolean tailLift) {
		this.tailLift = tailLift;
	}
	public int getInLength() {
		return inLength;
	}
	public void setInLength(int inLength) {
		this.inLength = inLength;
	}
	public int getInWidth() {
		return inWidth;
	}
	public void setInWidth(int inWidth) {
		this.inWidth = inWidth;
	}
	public int getInHeight() {
		return inHeight;
	}
	public void setInHeight(int inHeight) {
		this.inHeight = inHeight;
	}
	@Override
	public String toString() {
		return "Van [tailLift=" + tailLift + ", inLength=" + inLength + ", inWidth=" + inWidth + ", inHeight="
				+ inHeight + ", getNumOfWheels()=" + getNumOfWheels() + ", getMake()=" + getMake() + ", getModel()="
				+ getModel() + ", getColour()=" + getColour() + ", getEngineSize()=" + getEngineSize() + "]";
	}


}
