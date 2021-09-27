package com.libercom.lab1.task2;

import java.util.ArrayList;

class Student {
    public String name;
    public String surname;
    public int age;
    public int mark;

    Student(String name, String surname, int age, int mark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mark = mark;
    }

    public void printStudent() {
        System.out.println(this.name + " " + this.surname + ". Age: " + this.age + ". Mark: " + this.mark);
    }
}

class University {
    public String name;
    public int foundationYear;
    public ArrayList<Student> listOfStudents;

    University(String name, int foundationYear, ArrayList<Student> listOfStudents) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.listOfStudents = listOfStudents;
    }

    public void printStudents() {
        listOfStudents.forEach(Student::printStudent);
    }
}

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Ivan", "Chiorul", 21, 10));
        listOfStudents.add(new Student("George", "Schiopul", 20, 8));
        listOfStudents.add(new Student("Andrei", "Odnorukii", 21, 8));

        University university = new University("UTM", 1972, listOfStudents);

        university.printStudents();
    }
}
