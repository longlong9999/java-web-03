/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import com.java.date.Student;
import com.java.math.Fraction;


/**
 *
 * @author pc
 */
public class Main {

    private static int sum = 0;
    public static int add(int a, int b) {
        return a+b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fraction b = new Fraction(12, 16);
        b.print();
        Fraction reduce = b.reduce();
        b.print();
        reduce.print();
        
        
        
        
        
//        System.out.println("Hello");
//        Student.rollNumber = "234234";
//        System.out.println(Student.PI);
//        Student.printInfo();
        
//        int rs = add(2,3);
//        System.out.println(rs);
//        MyDate date = new MyDate();
//        date.setDate(1);
//        date.month = 3;
//        date.setYear(1999);
//        System.out.println(date);

        
    }
    
}
