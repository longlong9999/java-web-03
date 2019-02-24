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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m1Values = { {1,2,3}, {3,2,1}, {1,1,1} };
        int[][] m2Values = { {3,1,5}, {2,1,4}, {2,2,2} };
        
        Matrix m1 = new Matrix(3, 3, m1Values );
        Matrix m2 = new Matrix(3, 3, m2Values );
        
        
        boolean isDx = m1.checkDX();
        m1.print();
        if (isDx) System.out.println("Ma tran doi xung");
        else System.out.println("Ma tran khogn doi xung");
        
//        Matrix sum = m1.add(m2);
//        sum.print();
                
    }
    
}
