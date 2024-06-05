package ParkingLotDesign.ParkingSlot;

import ParkingLotDesign.Vehicle.Vehicle;

public class TwoWheelerSlot implements ParkingSlot {

    public static final int SLOT_PRICE = 40;

    String id;
    Vehicle parkedVehicle;

    @Override
    public void ParkVehicle(Vehicle vehicle) {
        // TODO Auto-generated method stub
       this.parkedVehicle = vehicle;
    }

    @Override
    public void removeVehicle() {
        this.parkedVehicle = null;
    }
    
}
