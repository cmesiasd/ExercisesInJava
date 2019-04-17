package com.cc3002.patterns.doubledispatch.distances;

public interface IMedicion {
    double getDist();
    IMedicion add(IMedicion med);
    Meters addToMeters(Meters meter);
    Inches addToInches(Inches inchs);
}
