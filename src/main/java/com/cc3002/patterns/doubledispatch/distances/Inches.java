package com.cc3002.patterns.doubledispatch.distances;

public class Inches extends AbstractDistance{
    public Inches(double inches){
        super(inches);
    }

    @Override
    public IMedicion add(IMedicion med) {
        return med.addToInches(this);
    }

    @Override
    public Inches addToInches(Inches inchs) {
        return new Inches(getDist() + inchs.getDist());
    }

    @Override
    public Meters addToMeters(Meters meter) {
        return new Meters(meter.getDist() + getDist()*0.0254);
    }
}
