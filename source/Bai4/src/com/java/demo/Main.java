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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String email = new String();
//        email = "hoangnm@gmail.com";
        String email = "hoangnm@gmail.com";
        String name = "          hoangnm        ";
        
        
        System.out.println(email.length());
        System.out.println(email.charAt(4));
        System.out.println(email.indexOf("y"));
        System.out.println(email.lastIndexOf("o"));
        System.out.println(email.compareTo(name));
        System.out.println(email.equals(name));
        System.out.println(name.concat("@@@@@"));
        System.out.println(name.trim());
        
//        int[][] matrix = new int[3][3];
//        int[][] matrix = { {1,2,3}, 
//                           {1,2,3}, 
//                           {1,2,3}, 
//                           {1,2,3} };
//        
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                matrix[i][j] = 1;        
////            }
////        }
//        
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("---------------------");
//        for (int[] row : matrix) {
//            for (int cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println("");
//        }
        
//        double[] numbers = new double[3];
//        Scanner input = new Scanner(System.in);
//        
//        double sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("So thu %d : ", i);
//            numbers[i] = input.nextDouble();
//            sum += numbers[i];
//        }
//        
//        System.out.println("SUM : " + sum);
//        
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.println(numbers[i]);
////        }
//
//        for (double item : numbers) {
//            System.out.println(item);
//        }
//        
//        
//        
        
        
        
//        int[] numbers = new int[10];
//        int[] numbers = { 1,2,3,4,5,6,7,8,9,0 };
//
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = 1;
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("number["+i+"] = " + numbers[i]);    
//        }



        
    }
    
}
