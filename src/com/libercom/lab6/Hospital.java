package com.libercom.lab6;

public class Hospital {
    private String name;
    private String address;
    private String phone;
    private Department[] departments;

    public String getPatientPhone(Person person) {
        return person.getPhone();
    }
}
