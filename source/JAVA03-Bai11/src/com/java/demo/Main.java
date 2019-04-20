/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        List<String> list = new ArrayList<>();
////        list.add(12);
////        list.add(12.4);
//        list.add("Hoang");
//        list.add("Hoang");
//        list.add("Hoang");
//        list.add("Hoang");
//        
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Book");
//        list.add("Student");
//        
//        list.remove(0);
//        list.remove("Hello");
//       
////        list.clear();
//        System.out.println(list.size());
//        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        
//        System.out.println(list.indexOf("Book"));
        
        
        //-----
        
//        Student a = new Student(2, "BINH");
//        Student b = new Student(3, "THANH");
//        System.out.println(a.equals(b));
        
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(3, "CONG"));
        stud.add(new Student(2, "BINH"));
        stud.add(new Student(1, "AN"));
        stud.add(new Student(4, "DAO"));
        
//        stud.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        boolean remove = stud.remove(new Student(2, "BINH"));
//        System.out.println(remove);
        
        for (Student s : stud) {
            System.out.println(s);
        }
        
        
        Vector<String> v = new Vector<>();
        v.addElement("HOANG");
        v.add("HUNG");
        System.out.println(v.elementAt(0));
        System.out.println(v.get(1));
        System.out.println(v.size());
        
        for (String item : v) {
            System.out.println(item);
        }
        
        System.out.println("=============+LINKEDLIST+=========");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ANH");
        linkedList.add("BINH");
        linkedList.add("CUONG");
        linkedList.add("DUNG");
        
        System.out.println(linkedList.size());
        for (String item : linkedList) {
            System.out.println(item);
        }
        
        Queue q = new ArrayDeque();
        
    }
    
}
