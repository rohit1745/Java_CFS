package com.cfs.web;

public class student {
    public final String name;
    public final String email;
    public final int marks;
    public final int rollNo;
    public final String country;

    public int getMarks() {
        return marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }

    public student(String name, String email, int marks, int rollNo, String country) {
        this.name = name;
        this.email = email;
        this.marks = marks;
        this.rollNo = rollNo;
        this.country= country;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                ", country='" + country + '\'' +
                '}';
    }
}
