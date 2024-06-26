package ParkingLotDesign.ParkingSlotManager;

import java.util.List;

import ParkingLotDesign.ParkingSlot.ParkingSlot;
import ParkingLotDesign.ParkingSlotManager.ParkingStatergy.ParkingStatergy;
import ParkingLotDesign.Vehicle.Vehicle;

public abstract class ParkingSlotManager {

    List<ParkingSlot> parkingSlots;
    ParkingStatergy parkingStatergy;

    public void AddParkingSlot(ParkingSlot parkingSlot) {
        parkingSlots.add(parkingSlot);
    }
    public void RemoveParkingSlot(ParkingSlot parkingSlot) {
        parkingSlots.remove(parkingSlot);
    }
    

    public ParkingSlotManager(List<ParkingSlot> parkingSlots, ParkingStatergy parkingStatergy) {
        this.parkingSlots = parkingSlots;
        this.parkingStatergy = parkingStatergy;
    }

    public ParkingSlot GetParkingSlot(Vehicle vehicle){
        return this.parkingStatergy.GetSlot(parkingSlots);
    }
}
