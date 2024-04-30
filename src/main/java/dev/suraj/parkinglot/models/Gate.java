package dev.suraj.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private Long gateNumber;
    private Operator operator;
    private GateType gateType;
    private GateStatus gateStatus;
}
