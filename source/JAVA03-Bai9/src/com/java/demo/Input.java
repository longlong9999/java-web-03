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
public class Input {

    public int inputNumber() {

        Scanner input = new Scanner(System.in);

        int a = 0;
        try {
            System.out.print("Nhap so > ");
            a = Integer.parseInt(input.nextLine());
            
        } catch (Exception e) {
            System.out.println("Khong dung dinh dang");
            return this.inputNumber();
        }
        return a;
        

//        boolean flag;
//        do {
//            flag = true;
//            try {
//                System.out.print("Nhap so > ");
//                a = Integer.parseInt(input.nextLine());
//            } catch (Exception e) {
//                System.out.println("Khong dung dinh dang");
//                flag = false;
//            }
//        } while (!flag);
    }

}
