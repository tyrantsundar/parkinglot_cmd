package com.parkinglot_cmd.entities;

import java.util.List;

public class Bill extends  BaseModel{
    private Ticket ticket;
    private FeeCalculationStrategy strategy;
    private Long exitTime;
    private Gate gate;
    private Operator operator;
    private List<Payment> payments;
    private double amount;
    private BillStatus billStatus;
}
