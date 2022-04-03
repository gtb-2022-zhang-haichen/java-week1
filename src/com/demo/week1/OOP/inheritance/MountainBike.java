package com.demo.week1.OOP.inheritance;

import com.demo.week1.OOP.bike.Bicycle;

public class MountainBike extends Bicycle {

    // own field
    public int seatHeight;

    public MountainBike(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
}
