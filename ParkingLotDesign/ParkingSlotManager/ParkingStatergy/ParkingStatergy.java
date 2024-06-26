package ParkingLotDesign.ParkingSlotManager.ParkingStatergy;

import java.util.List;

import ParkingLotDesign.ParkingSlot.ParkingSlot;

public interface ParkingStatergy {
    public ParkingSlot GetSlot(List<ParkingSlot> parkingSlots);
}
