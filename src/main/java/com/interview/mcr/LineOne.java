package com.interview.mcr;

public class LineOne {
    String type;
    String country;
    String surname;
    String givenName;

    public LineOne(String type, String country, String surname, String givenName) {
        this.type = type;
        this.country = country;
        this.surname = surname;
        this.givenName = givenName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
