package com.tss;

public class ServiceDepartment extends Department {
	// In the ServiceDepartment class

	public boolean changeEngineOil(Vehicle v) {
		if (v != null) {
			// logic to note a change of engine oil of variable v
			return true;
		}
		return false;
	}
	
	public boolean changeEngineOil(LightTruck v) {
		if (v != null) {
			// logic to note a change of engine oil of variable v
			return true;
		}
		return false;
	}
}
