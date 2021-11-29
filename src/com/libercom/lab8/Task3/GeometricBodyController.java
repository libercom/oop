package com.libercom.lab8.Task3;

import java.util.Arrays;

public class GeometricBodyController {
    public static GeometricBody getFigureWithBiggestSurface(GeometricBody[] figures) {
        return Arrays.stream(figures).reduce((a, b) -> a.getSurface() > b.getSurface() ? a : b).orElse(null);
    }

    public static GeometricBody getFigureWithBiggestVolume(GeometricBody[] figures) {
        return Arrays.stream(figures).reduce((a, b) -> a.getVolume() > b.getVolume() ? a : b).orElse(null);
    }
}
