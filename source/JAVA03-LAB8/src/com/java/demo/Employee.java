/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Employee extends Person{
    
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        System.out.print("Salary > ");
        this.salary = Double.parseDouble(input.nextLine());
    }
    
    @Override
    public String toString() {
        return "Student{id=" + this.getId() + ",name=" + this.getName() + ",salary=" + salary + '}';
    }
    
}
