package ParkingLotDesign.CostComputation;

import ParkingLotDesign.CostComputation.CostingStatergy.CostStatergy;
import ParkingLotDesign.Ticket.Ticket;

public abstract class  CostComputation {
    CostStatergy costStatergy;

    public CostComputation(CostStatergy costStatergy) {
        this.costStatergy = costStatergy;
    }

    public double ComputeCost(Ticket ticket) {
        return costStatergy.computeCost(ticket);
    }
    
}
