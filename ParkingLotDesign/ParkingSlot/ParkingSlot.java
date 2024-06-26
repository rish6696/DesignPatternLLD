package ParkingLotDesign.ParkingSlot;

import ParkingLotDesign.Vehicle.Vehicle;

public interface ParkingSlot {
    public void ParkVehicle(Vehicle vehicle);
    public void RemoveVehicle();
    public boolean isAvailable();
}
