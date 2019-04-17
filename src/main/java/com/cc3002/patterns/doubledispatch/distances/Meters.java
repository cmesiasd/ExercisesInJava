package com.cc3002.patterns.doubledispatch.distances;

public class Meters extends AbstractDistance{
    public Meters(double meter){
        super(meter);
    }

    @Override
    public IMedicion add(IMedicion med) {
        return med.addToMeters(this);
    }

    @Override
    public Inches addToInches(Inches inches) {
        return new Inches(inches.getDist() + getDist()*39.37);
    }

    @Override
    public Meters addToMeters(Meters meter) {
        return new Meters(getDist() + meter.getDist());
    }
}
