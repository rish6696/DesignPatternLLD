package ParkingLotDesign.Ticket;

import java.time.LocalDate;
import java.util.UUID;


import ParkingLotDesign.EntranceGate.EntranceGate;
import ParkingLotDesign.ParkingSlot.ParkingSlot;
import ParkingLotDesign.Vehicle.Vehicle;

public class Ticket {
    public Vehicle vehicle;
    UUID ticketID;
    EntranceGate gate;
    ParkingSlot slot;
    LocalDate entryTime;

    public Ticket(Vehicle vehicle, UUID ticketID, EntranceGate gate, ParkingSlot slot, LocalDate entryTime) {
        this.vehicle = vehicle;
        this.ticketID = ticketID;
        this.gate = gate;
        this.slot = slot;
        this.entryTime = entryTime;
    }
}
