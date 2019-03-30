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
public class Calculator {

    public double div() throws ArithmeticException{
        double a = input();
        System.out.println("a = " + a);
        double b = input();
        System.out.println("b = " + b);
        if (b == 0) throw new ArithmeticException("Khong ton tai phep chia cho 0");
        return a / b;
    }

    private double input() {
        double b = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap so > ");
            b = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai dinh dang. Nhap lai");
            return this.input();
        }
        return b;
    }
}
