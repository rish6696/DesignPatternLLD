package ParkingLotDesign.ParkingSlot;

import ParkingLotDesign.Vehicle.Vehicle;

public class FourWheelerSlot implements ParkingSlot {

    public static final int SLOT_PRICE = 40;

    String id;
    Vehicle parkedVehicle;

    @Override
    public void ParkVehicle(Vehicle vehicle) {
       this.parkedVehicle = vehicle;
    }

    @Override
    public void RemoveVehicle() {
        this.parkedVehicle = null;
    }

    @Override
    public boolean isAvailable() {
       return this.parkedVehicle == null;
    }
    
}
