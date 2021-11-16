package com.libercom.lab6;

import java.util.Date;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String fullName;
    private Date birthDate;
    private char gender;
    private String homeAddress;
    private String phone;

    public Hospital getClosestHospital(Hospital[] hospitals) {
        return hospitals[0];
    }

    public String getPhone() {
        return phone;
    }
}
