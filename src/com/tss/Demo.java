package com.tss;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String args[]) {
		System.out.println("Welcome to the Car Dealership!");

		// Now, in code that used the LightTruck class

		LightTruck lt = new LightTruck("16896XCKJE8", 48000.00, 62000.00, 2019, "Chevrolet", "Silverado", "Silver",
				10000L, 90000L, true);

		if (lt.is4wd) {
			int gears = lt.xferCase.getNumGears();
			System.out.println(gears);
		}

		lt.setVehicleClass(VehicleClassification.OFF_LEASE);

//		VehicleClassification myTruckClassification = lt.getVehicleClass();
//		
//		System.out.println(myTruckClassification);

		lt.printVehicleType();

		ServiceDepartment larrysOilChange = new ServiceDepartment();

		Boolean hasLarryChangedTheOil = larrysOilChange.changeEngineOil(lt);

		System.out.println(hasLarryChangedTheOil);

//		Department myCreditUnion = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE);

		// based on the code seen earlier in main()
		// instead of "new"ing each department, the factory creates them
		Department sd = DepartmentFactory.CreateDepartment(DepartmentNames.SERVICE);
		Department fd = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE);

		List<Department> depts = new ArrayList<Department>();
		depts.add(sd);
		depts.add(fd);
		System.out.println(depts);
	}
}
