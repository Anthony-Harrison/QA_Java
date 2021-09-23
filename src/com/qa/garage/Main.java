package com.qa.garage;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car(5, "Honda", "Jazz", "Silver", 1.2d);
		Motorbike b1 = new Motorbike(5, "Bike", "Vroomer", "Green", 1d);
		Van v1 = new Van(5, "Big", "White", "Van", 2.0d, 50, 50, 50, false);
		Garage garage = new Garage();
		
		garage.addVehicle(c1);
		garage.addVehicle(b1);
		garage.addVehicle(v1);
		
		
		garage.garageList();
		garage.vehicleBill();
		System.out.println("\n=======================================\n");
		garage.removeVehicle(b1);
		garage.vehicleBill();
		

	}

}
