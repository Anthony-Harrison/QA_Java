package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> garage = new ArrayList<>();

	public List<Vehicle> getGarage() {
		return garage;
	}

	public void addVehicle(Car vehicle) {
		garage.add(vehicle);
	}

	public void addVehicle(Motorbike vehicle) {
		garage.add(vehicle);
	}

	public void addVehicle(Van vehicle) {
		garage.add(vehicle);
	}

	public void removeVehicle(Car vehicle) {
		garage.remove(vehicle);
	}

	public void removeVehicle(Motorbike vehicle) {
		garage.remove(vehicle);
	}

	public void removeVehicle(Van vehicle) {
		garage.remove(vehicle);
	}

	public void garageList() {
		for (int i = 0; i < getGarage().size(); i++)
			
		System.out.println(getGarage().get(i));
	}
	public void vehicleBill() {
		for(int i = 0; i < getGarage().size(); i++) {
			Object x = getGarage().get(i);
			if(x.toString().contains("Car")) {
				System.out.println("Your Car bill is £10");
			}
			else if(x.toString().contains("Van")) {
				System.out.println("Your Van bill is £50");				
			}
			else if(x.toString().contains("Motorbike")) {
				System.out.println("Your Motorbike bill is £20");
			}
		}
	}
}





