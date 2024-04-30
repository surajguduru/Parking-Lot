package dev.suraj.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private int floorNo;
    private int noOfSpots;

    private List<ParkingSpot> parkingSpots;

    private ParkingFloorStatus parkingFloorStatus;
}
