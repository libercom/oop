package com.libercom.lab1.task1;

class Monitor {
    public String color;
    public String resolution;
    public float dimensions;

    Monitor(float dimensions, String resolution, String color) {
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public void compare(Monitor monitor) {
        if (this.dimensions > monitor.dimensions) {
            System.out.println("The first monitor has higher dimensions: " + this.dimensions + " > " + monitor.dimensions);
        } else {
            System.out.println("The second monitor has higher dimensions: " + monitor.dimensions + " > " + this.dimensions);
        }

        System.out.println("The first monitor has a " + this.resolution + ", while the second one - " + monitor.resolution);
        System.out.println("The first monitor is " + this.color + ", while the second one is " + monitor.color);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(23.8f, "Full HD", "Black");
        Monitor monitor2 = new Monitor(20.0f, "Full HD", "White");

        monitor.compare(monitor2);
    }
}
