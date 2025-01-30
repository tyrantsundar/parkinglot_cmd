package com.parkinglot_cmd.entities;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNo;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;
}
