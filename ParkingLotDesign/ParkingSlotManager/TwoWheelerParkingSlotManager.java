package ParkingLotDesign.ParkingSlotManager;

import java.util.List;

import ParkingLotDesign.ParkingSlot.ParkingSlot;
import ParkingLotDesign.ParkingSlotManager.ParkingStatergy.ParkingStatergy;

public class TwoWheelerParkingSlotManager extends ParkingSlotManager {

    public TwoWheelerParkingSlotManager(List<ParkingSlot> parkingSlots, ParkingStatergy parkingStatergy) {
        super(parkingSlots,parkingStatergy);
    }
    
}
