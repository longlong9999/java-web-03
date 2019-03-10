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
public class Rectangle extends Shape{
    private double weight;
    private double height;

    public Rectangle() {
    }

    
    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.weight;
    }
    
    public double area() {
        return this.height * this.weight;
    }
}
