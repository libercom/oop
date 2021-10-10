package com.libercom.lab2.task1;

import java.util.ArrayList;

class Box {
    public int width;
    public int height;
    public int depth;

    Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    Box(int value) {
        this.width = value;
        this.height = value;
        this.depth = value;
    }

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void showBox() {
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Depth: " + this.depth);
        System.out.println();
    }
}

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box());
        boxes.add(new Box(4));
        boxes.add(new Box(2, 3, 4));

        boxes.forEach(Box::showBox);
    }
}
