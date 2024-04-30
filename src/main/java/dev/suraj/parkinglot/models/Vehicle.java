package dev.suraj.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private VehicleType vehicleType;
    private String ownerName;
    private String number;
}
