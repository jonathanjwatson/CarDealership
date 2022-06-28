package com.tss;

public class LeaseVehicleFactory
{
  public static Leaseable getLeasableVehicleByVin(String VIN)
  {
    Leaseable leaseable = null;
    
    // get the vehicle type, then lookup details in datastore
	String vehicleType = decodeVinForType(VIN);
    if(vehicleType.equals("Car"))
    {
      leasable = getCarDetails(VIN);
    }
    else if (VehicleType.equals("LightTruck"))
    {
      leasable = getTruckDetails(VIN);
    }
    // more types.  if not found return null
    return leaseable;
  }

private static Object getCarDetails(String vIN) {
	// TODO Auto-generated method stub
	return null;
}

private static String decodeVinForType(String vIN) {
	// TODO Auto-generated method stub
	return null;
}
}

// called in main as follows:
//Leaseable l = LeaseVehicleFactory.getLeasableVehicleByVin("16896XCKJE8");
//
//System.out.println("Can be leased? " + l.isLeaseable());