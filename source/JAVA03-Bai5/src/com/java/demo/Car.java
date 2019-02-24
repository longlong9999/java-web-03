/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author pc
 */
public class Car {

    private String maker;
    private String name;
    
    public Car() {
        System.out.println("Khoi tao 1 doi tuong moi");
    }
    
    public Car(String maker) {
        this.maker = maker;
    }
    
    public Car(String maker, String name) {
        this.maker = maker;
        this.name = name;
    }
    
    // getter - setter
    public String getMaker() {
        return this.maker;
    }
    
    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void printInfo() {
        System.out.println("Maker: " + this.maker);
        System.out.println("Name: " + this.name);   
    }
    
}
