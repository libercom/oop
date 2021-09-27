package com.libercom.lab1.task3;

import java.util.ArrayList;
import java.util.Arrays;

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

    public int getMark() {
        return this.mark;
    }
}

class University {
    public String name;
    public int foundationYear;
    public ArrayList<Student> listOfStudents;

    University(String name, int foundationYear, Student[] listOfStudents) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.listOfStudents = new ArrayList<>(Arrays.asList(listOfStudents));
    }

    public void averageMedia() {
        int result = this.listOfStudents.stream().map(Student::getMark).reduce(0, Integer::sum);
        System.out.printf("The average media of the students' marks from the " + this.name + " is %.2f\n", (double) result / listOfStudents.size());
    }
}

public class Task3 {
    public static void main(String[] args) {
        University university1 = new University("UTM", 1972, new Student[]{
                new Student("Ion", "Chiorul", 21, 10),
                new Student("George", "Schiopul", 20, 10),
                new Student("Andrei", "Odnorukii", 21, 9)
        });
        University university2 = new University("USM", 1972, new Student[]{
                new Student("Dinu", "Chiperi", 19, 6),
                new Student("Avram", "Fratea", 20, 9),
                new Student("Ion", "Tigara", 19, 8)
        });
        University university3 = new University("ASEM", 1972, new Student[]{
                new Student("Marin", "Frunza", 21, 7),
                new Student("Vasile", "Cel Frumos", 22, 9),
                new Student("Vasile", "Guja", 19, 6)
        });

        university1.averageMedia();
        university2.averageMedia();
        university3.averageMedia();
    }
}
