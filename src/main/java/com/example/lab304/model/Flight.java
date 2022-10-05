package com.example.lab304.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    private String flightNumber;
    private String aircraftModel;
    private int fligthMilleage;

    public Flight(String flightNumber, String aircraftModel, int fligthMilleage) {
        this.flightNumber = flightNumber;
        this.aircraftModel = aircraftModel;
        this.fligthMilleage = fligthMilleage;
    }

    public Flight() {
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public int getFligthMilleage() {
        return fligthMilleage;
    }

    public void setFligthMilleage(int fligthMilleage) {
        this.fligthMilleage = fligthMilleage;
    }
}
