/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.File;
import java.io.IOException;
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
        // TODO code application logic here
        FileUtils fu = new FileUtils();
        try {
//            fu.read();
//            fu.write();
//            fu.writeObject();
            fu.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        File f = new File("/Users/pc/demo");
//        if (f.exists()) {
//            if (f.isFile()) {
//                System.out.println(f.getAbsolutePath());
//                System.out.println(f.getPath());
//                System.out.println(f.getName());
//                
//                System.out.println("Day la file");
//            }
//            else {
//                System.out.println("Day khong la file");
////                String[] list = f.list();
////                for (String name : list) {
////                    System.out.println(name);
////                }
//                System.out.println(f.renameTo(new File("/Users/pc/java-core")));
////                File[] files = f.listFiles();
////                for (File file : files) {
////                    if (file.getName().endsWith(".java")) {
////                        file.delete();
////                    }
////                }
//            }
//                
//     
////            System.out.println(f.delete());
//        } else {
//            System.out.println("File khong ton tai");
//            System.out.println(f.mkdir());
////            try {
////                System.out.println(f.createNewFile());
////            } catch (IOException ex) {
////                ex.printStackTrace();
////            }
//        }
    }

}
