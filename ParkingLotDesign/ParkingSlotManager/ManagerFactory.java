package ParkingLotDesign.ParkingSlotManager;

import java.util.List;

import ParkingLotDesign.ParkingSlot.ParkingSlot;
import ParkingLotDesign.ParkingSlotManager.ParkingStatergy.DefaultParkingStatergy;
import ParkingLotDesign.Vehicle.VehicleType;

public class ManagerFactory {

    List<ParkingSlot> twoWheelerSpots;
    List<ParkingSlot> fourWheelerSpots;

    public ManagerFactory(List<ParkingSlot> twoWheelerSpots, List<ParkingSlot> fourWheelerSpots) {
        this.twoWheelerSpots = twoWheelerSpots;
        this.fourWheelerSpots = fourWheelerSpots;
    }


    public ParkingSlotManager GetParkingSlotManager(VehicleType type) {
        switch (type) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSlotManager(this.twoWheelerSpots, new DefaultParkingStatergy());
            case FOUR_WHEELER:
                return new FourWheelerSlotManager(this.fourWheelerSpots, new DefaultParkingStatergy());
            default:
                throw new UnsupportedOperationException("Unsupported vehicle type");
        }
    }
}
