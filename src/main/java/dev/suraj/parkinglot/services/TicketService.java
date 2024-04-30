package dev.suraj.parkinglot.services;

import dev.suraj.parkinglot.exceptions.InvalidGateException;
import dev.suraj.parkinglot.models.Gate;
import dev.suraj.parkinglot.models.Ticket;
import dev.suraj.parkinglot.models.VehicleType;
import dev.suraj.parkinglot.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}
