package com.libercom.lab7.Tasks;

import com.libercom.lab7.*;

public class Tasks {
    public static void main(String[] args) {
        Figure circle = new Figure() {
            final double radius = 3;

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public double getArea() {
                return Math.PI * Math.pow(radius, 2);
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "radius=" + radius +
                        "}";
            }
        };

        Figure[] figures = new Figure[] {
                new Triangle(2, 3, 4),
                new Rectangle(2, 4),
                new Square(4),
                circle
        };
        System.out.println("Area " + circle.getArea() + ", Perimeter " + circle.getPerimeter());

        System.out.println(FigureController.getFigureWithBiggestArea(figures));
        System.out.println(FigureController.getFigureWithBiggestPerimeter(figures));
    }
}
