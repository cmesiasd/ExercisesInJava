package com.cc3002.patterns.doubledispatch.distances;

public abstract class AbstractDistance implements IMedicion {
    private double value;

    public AbstractDistance(double value){
        this.value = value;
    }

    public double getDist() {
        return value;
    }

    @Override
    public abstract IMedicion add(IMedicion med);

    @Override
    public abstract Meters addToMeters(Meters meter);

    @Override
    public abstract Inches addToInches(Inches inchs);
}
