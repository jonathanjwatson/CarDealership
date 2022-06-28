package com.tss;

public class LightTruck extends Vehicle {
	public class TransferCase {
		public TransferCase() {
			this.numGears = 4;
		}

		public TransferCase(int gears) {
			this.numGears = gears;
		}

		private int numGears;

		public int getNumGears() {
			return this.numGears;
		}
	}

	// member to represent the inner class
	public TransferCase xferCase;
	public Boolean is4wd;

	// in the constructor, manage if the truck object will have
	// a transfer case
	public LightTruck(String vin, double d, double e, Integer year, String make, String model, String color, Long a,
			Long b, Boolean is4wd) {
		// other ctor statements
		this.is4wd = is4wd;
		if (this.is4wd == true) {
			this.xferCase = new TransferCase();
		}
	}
}

//// Now, in code that used the LightTruck class
//
//LightTruck lt = new LightTruck("16896XCKJE8", 48000.00, 62000.00,
//                                2019, "Chevrolet",
//                                "Silverado", "Silver", 
//                                10000L, 90000L, true); 
//
//if (lt.is4wd)
//{
//  int gears = lt.xferCase.numGears;
//  System.out.println(")
//}