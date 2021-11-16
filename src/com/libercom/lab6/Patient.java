package com.libercom.lab6;

import java.util.Date;

public class Patient extends Person {
    private String id;
    private int age;
    private Date accepted;
    private String[] sickness;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;

    public String[] getAllergies() {
        return allergies;
    }
}
