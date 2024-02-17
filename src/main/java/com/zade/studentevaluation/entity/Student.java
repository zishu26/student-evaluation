package com.zade.studentevaluation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String roll;

    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;
    private double marks5;
    private double marks6;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    public double getMarks3() {
        return marks3;
    }

    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }

    public double getMarks4() {
        return marks4;
    }

    public void setMarks4(double marks4) {
        this.marks4 = marks4;
    }

    public double getMarks5() {
        return marks5;
    }

    public void setMarks5(double marks5) {
        this.marks5 = marks5;
    }

    public double getMarks6() {
        return marks6;
    }

    public void setMarks6(double marks6) {
        this.marks6 = marks6;
    }
}
