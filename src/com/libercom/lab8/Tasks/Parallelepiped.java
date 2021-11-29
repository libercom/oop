package com.libercom.lab8.Tasks;

public class Parallelepiped extends GeometricBody {
    private double faceBase;
    private double faceHeight;
    private double height;

    public Parallelepiped(double faceHeight, double faceBase, double height) {
        this.faceHeight = faceHeight;
        this.faceBase = faceBase;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 6 * faceBase * faceHeight;
    }

    @Override
    public double getVolume() {
        return getSurface() * height;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "faceBase=" + faceBase +
                ", faceHeight=" + faceHeight +
                ", height=" + height +
                '}';
    }
}
