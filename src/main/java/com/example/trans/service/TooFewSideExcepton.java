package com.example.trans.service;

public class TooFewSideExcepton extends Throwable {
    private int numOfSides;
    public TooFewSideExcepton(String s, int numOfSides) {
        this.numOfSides = numOfSides;
        System.out.println ( s + ":" + numOfSides);
    }
}
