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
public class bai6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so > ");
        int num = input.nextInt();
        System.out.println("Ket qua");
        
        String kq = (num % 2 == 0) ? "So chan" : "So le";
        System.out.println(kq);
        
    }
}
