/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.math;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Numerator > ");
        this.numerator = input.nextInt();
        System.out.println("Denominator > ");
        this.denominator = input.nextInt();
    }
    
    public void print() {
        System.out.println(this.numerator + "/" + this.denominator);
    }
    
//    public void reduce() {
//        int gcd = this.gcd(numerator, denominator);
//        this.numerator = this.numerator / gcd;
//        this.denominator = this.denominator / gcd;
//    }
    
    public Fraction reduce() {
        int gcd = this.gcd(numerator, denominator);
        int numerator = this.numerator / gcd;
        int denominator = this.denominator / gcd;
        return new Fraction(numerator, denominator);
    }
    
    private int gcd(int a, int b) {
        while( a != b ) {
            if ( a > b ) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
