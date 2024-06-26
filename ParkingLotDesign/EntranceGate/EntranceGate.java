package ParkingLotDesign.EntranceGate;


import java.util.List;
import java.util.UUID;

import ParkingLotDesign.ParkingSlot.ParkingSlot;
import ParkingLotDesign.ParkingSlotManager.ManagerFactory;
import ParkingLotDesign.ParkingSlotManager.ParkingSlotManager;
import ParkingLotDesign.Ticket.Ticket;
import ParkingLotDesign.Vehicle.Vehicle;

public class EntranceGate {

    String id;
    String gateName;
    ManagerFactory parkingSlotManagerFactory;

    public EntranceGate(String id, String gateName, ManagerFactory parkingSlotManagerFactory) {
        this.id = id;
        this.gateName = gateName;
        this.parkingSlotManagerFactory = parkingSlotManagerFactory;
    }

    public Ticket TakeVehicle(Vehicle vehicle){
        ParkingSlotManager manager = this.parkingSlotManagerFactory.GetParkingSlotManager(vehicle.type); 
        ParkingSlot slot = manager.GetParkingSlot(vehicle);
        slot.ParkVehicle(vehicle);
        UUID ticketID = UUID.randomUUID();
        Ticket ticket = new Ticket(vehicle,ticketID,this,slot,java.time.LocalDate.now());
        return ticket;
    }
}