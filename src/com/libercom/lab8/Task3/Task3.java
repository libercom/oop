package com.libercom.lab8.Task3;



public class Task3 {
    public static void main(String[] args) {
        GeometricBody[] figures = new GeometricBody[]{
                new Cube(2),
                new Sphere(3),
                new Parallelepiped(2, 3, 4)
        };

        System.out.println(GeometricBodyController.getFigureWithBiggestSurface(figures));
        System.out.println(GeometricBodyController.getFigureWithBiggestVolume(figures));
    }
}
