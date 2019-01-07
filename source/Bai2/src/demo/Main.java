/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 30;
        int max = a > b ? a + 10 : b + 20;
        System.out.println("Max = " + max);
        
        char gender;
        
        double sum = 0;
        
        a = (int) sum;
        
        
        
        int age = 0;
        ++age;
        age++;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap tuoi: ");
        age = input.nextInt();
        
        System.out.println("So thu 1: ");
        double num1 = input.nextDouble();
        
        System.out.println("So thu 2: ");
        double num2 = input.nextDouble();
        
        
        sum = num1 + num2;
        
        boolean isValid = true;
        
        String email = "hoangnm@ows.vn";
        
        System.out.println("Tuoi : " + age);
        
        System.out.println("Tong: " + sum);
        
    }
    
}
