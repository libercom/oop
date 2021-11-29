package com.libercom.lab8.Task3;

public class Cube implements GeometricBody {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                '}';
    }
}
