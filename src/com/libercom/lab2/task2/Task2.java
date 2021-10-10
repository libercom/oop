package com.libercom.lab2.task2;

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
    public Node <T> first;
    public Node <T> last;

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
        }

        last.next = node;
        last = last.next;
        this.size++;
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
}

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>(10);

        for (int i = 0, j = 2; i < 34; i += 3, j+= 3) {
            q1.push(i);
            q2.push(j);
        }

        System.out.println("The last element of q1 is: " + q1.getLast());
        System.out.println("The last element of q2 is: " + q2.getLast());
    }
}
