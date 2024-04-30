package dev.suraj.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class Bill extends BaseModel{
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private List<Payment> payments;

}
