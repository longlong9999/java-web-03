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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so > ");
        int num = input.nextInt();
        System.out.println("Ket qua");
//        System.out.println(num + "^2=" + num*num);
        System.out.printf("%d^2=%d", num, num*num);
    }
    
}
