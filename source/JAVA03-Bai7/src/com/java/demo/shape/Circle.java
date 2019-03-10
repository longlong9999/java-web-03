/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.shape;

/**
 *
 * @author pc
 */
public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Annotation
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
