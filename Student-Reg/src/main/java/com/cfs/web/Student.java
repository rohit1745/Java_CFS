package com.cfs.web;

public class Student {
    private final String name;
    private final String roll_no;
    private final String course;
    private final int marks;

    public Student(String name, String roll_no, String course, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRoll_No() {
        return roll_no;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no='" + roll_no    +    '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}