/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Input input = new Input();
        int a = input.inputNumber();
        System.out.println("a = " + a);
        int b = input.inputNumber();
        System.out.println("b = " + b);
        System.out.println(" a / b = " + (a/b));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        try {
//            Calculator cal = new Calculator();
//            System.out.println(cal.div());
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Chuong trinh ket thuc");
//        }
        

//        try {
//            // TODO code application logic here
//            Calculator cal = new Calculator();
//            
//            double rs = cal.div(1.2, 0);
//            System.out.println(rs);
//            
//            System.out.println("Ket thuc");
//        try {
//            System.out.println("tham so " + args[0]);
//            Scanner input = new Scanner(System.in);
//            System.out.print(" a > ");
//            int a = Integer.parseInt(input.nextLine());
//            System.out.print(" b > ");
//            int b = Integer.parseInt(input.nextLine());
////        if (b == 0) {
////            System.out.println("Phep chia cho 0 khong ton tai");
////            System.exit(0);
////        }
////      System.out.println("a / b = " + (a / b));
//
//            System.out.println("a / b = " + (a / b));
//        } catch (ArithmeticException e) {
//            System.out.println("Phep chia cho 0 khong ton tai");
//        } catch (NumberFormatException ex) {
//            System.out.println("Loi nhap khong dung dinh dang");
//        } catch (Exception e1) {
//            System.out.println("Chuong trinh co loi xay ra.");
//        }finally {
//            System.out.println("Ket thuc.");
//        }
//        } catch (EmailFormatException ex) {
//            ex.printStackTrace();
//        }
    }

}
