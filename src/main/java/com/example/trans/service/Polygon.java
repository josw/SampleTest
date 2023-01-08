package com.example.trans.service;

public class Polygon {
    private final int numOfSides;

    public Polygon(int numOfSides) throws TooFewSideExcepton {
        this.numOfSides = numOfSides;
        if (numOfSides <= 2) throw new TooFewSideExcepton("You must input more than 3 side ", numOfSides);
    }

    public int getNumOfSides() {
        return numOfSides;
    }
}
