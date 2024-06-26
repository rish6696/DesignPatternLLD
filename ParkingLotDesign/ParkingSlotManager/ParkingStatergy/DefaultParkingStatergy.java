package ParkingLotDesign.ParkingSlotManager.ParkingStatergy;

import java.util.List;

import ParkingLotDesign.ParkingSlot.ParkingSlot;

public class DefaultParkingStatergy implements ParkingStatergy {

    @Override
    public ParkingSlot GetSlot(List<ParkingSlot> parkingSlots) {
        for (ParkingSlot parkingSlot : parkingSlots) {
            if (parkingSlot.isAvailable()) {
                return parkingSlot;
            }
        }
        throw new RuntimeException("No slot available");
    }

}
