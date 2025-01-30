package com.parkinglot_cmd.entities;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> vehicleTypes;
    private List<Gate> gates;
    private SpotAssignmentStrategy spotAssignmentStrategy;
}
