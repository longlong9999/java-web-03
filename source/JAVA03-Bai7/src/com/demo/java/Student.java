/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java;

/**
 *
 * @author pc
 */
public class Student extends Person {

    private String studentId;
    
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    @Override
    public void print() {
        System.out.println(this.studentId + " " +super.toString());
    }

    @Override
    public String toString() {
        return this.studentId + " " + this.getName() + " " + this.getAge();
    }
    
}
