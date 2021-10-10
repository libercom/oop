package com.libercom.lab2.task3;

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
    
    public int getArea() {
        return 2 * (this.height * this.width) + 2 * (this.height * this.depth) + 2 * (this.width * this.depth);
    }
    
    public int getVolume() {
        return this.height * this.width * this.depth;
    }
}

class Node <T> {
    public T value;
    public Node<T> next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }
}

class Queue <T> {
    public int maxSize;
    public int size;
    public Node<T> first;
    public Node<T> last;

    Queue() {
        this.maxSize = Integer.MAX_VALUE;
        this.size = 0;
    }

    Queue(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void push(T value) {
        if (this.size >= this.maxSize) {
            System.out.println("Warning: The queue is already full. Try to pop something out and then try again");
            return;
        }

        Node<T> node = new Node<>(value);

        if (size == 0) {
            this.first = node;
            this.last = this.first;
            this.size++;
        } else {
            last.next = node;
            last = last.next;
            this.size++;
        }
    }

    public T pop() {
        T value = this.first.value;
        this.first = this.first.next;
        this.size--;

        return value;
    }

    public T getLast() {
        return this.last.value;
    }

    public void isFull() {
        if (this.maxSize == Integer.MAX_VALUE) {
            System.out.println("This queue can't be full");
        } else {
            if (this.size >= this.maxSize) {
                System.out.println("This queue is already full. Pop out something");
            } else {
                System.out.println("This queue is not full yet");
            }
        }
    }

    public void isEmpty() {
        if (this.size == 0) {
            System.out.println("This queue is empty");
        } else {
            System.out.println("This queue is not empty");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box());
        boxes.add(new Box(4));
        boxes.add(new Box(2, 3, 4));

        boxes.forEach(el -> System.out.println("Area: " + el.getArea()));
        boxes.forEach(el -> System.out.println("Volume: " + el.getVolume()));

        Queue<Integer> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>(10);

        q1.isEmpty();

        for (int i = 0, j = 2; i < 30; i += 3) {
            q1.push(i);
            q2.push(j);
        }

        q2.isEmpty();
        q1.isFull();
        q2.isFull();
        System.out.println("First goes out: " + q2.pop());
        q2.isFull();
    }
}
