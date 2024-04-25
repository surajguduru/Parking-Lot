package dev.suraj.parkinglot.models;

public class Ticket {
    private int id;
    private int number;
    private String entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate entryGate;
    private Gate exitGate;
}
