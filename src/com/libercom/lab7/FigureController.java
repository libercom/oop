package com.libercom.lab7;

import java.util.Arrays;
import java.util.List;

public class FigureController {
    public static Figure getFigureWithBiggestArea(Figure[] figures) {
        return Arrays.stream(figures).reduce((a, b) -> a.getArea() > b.getArea() ? a : b).orElse(null);
    }

    public static Figure getFigureWithBiggestPerimeter(Figure[] figures) {
        return Arrays.stream(figures).reduce((a, b) -> a.getPerimeter() > b.getPerimeter() ? a : b).orElse(null);
    }
}
