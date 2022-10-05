package com.example.lab304.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aircraft {

    @Id
    private String aircraftModel;

    private int totalSeats;

    public Aircraft() {
    }

    public Aircraft(String aircraftModel, int totalSeats) {
        this.aircraftModel = aircraftModel;
        this.totalSeats = totalSeats;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
