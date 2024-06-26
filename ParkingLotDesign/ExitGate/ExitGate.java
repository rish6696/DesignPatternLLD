package ParkingLotDesign.ExitGate;


import ParkingLotDesign.CostComputation.CostComputation;
import ParkingLotDesign.CostComputation.CostFactory;
import ParkingLotDesign.Ticket.Ticket;

public class ExitGate {

    String id;
    String name;
    CostFactory costFactory;

    public ExitGate(String id, String name, CostFactory costFactory) {
        this.id = id;
        this.name = name;
        this.costFactory = costFactory;
    }

    public double ExitVehicle(Ticket ticket){
        CostComputation costManager = this.costFactory.GetComputationFactory(ticket);
        double cost = costManager.ComputeCost(ticket);
        return cost;
    }
    
}
