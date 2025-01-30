package com.parkinglot_cmd.entities;

public class Ticket extends BaseModel{
    private Long entryTime;
    private Vehicle vehicle;
    private Operator operator;
    private Gate gate;
    private ParkingSpot parkingSpot;
}
