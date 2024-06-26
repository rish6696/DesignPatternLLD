package ParkingLotDesign.CostComputation;

import ParkingLotDesign.CostComputation.CostingStatergy.FixedCostStatergy;
import ParkingLotDesign.CostComputation.CostingStatergy.HourlyCostStatergy;
import ParkingLotDesign.Ticket.Ticket;

public class CostFactory {
    public CostComputation GetComputationFactory(Ticket ticket) {
        switch (ticket.vehicle.type) {
            case TWO_WHEELER:
                return new TwoWheelerComputation(new HourlyCostStatergy());
            case FOUR_WHEELER:
                return new FourWheelerCostComputation(new FixedCostStatergy());
            default:
                return null;
        }
    }
}
