/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        Map<String, String> mapVn = new HashMap<>();
        mapVn.put("Hello", "Xin chao");
        mapVn.put("Book", "Sach");
        mapVn.put("Cat", "Meo");
        mapVn.put("Dog", "CHO");
        
        Map<String, String> mapJp = new HashMap<>();
        mapJp.put("Hello", "こんにちは");
        mapJp.put("Book", "Sach");
        mapJp.put("Cat", "Meo");
        mapJp.put("Dog", "CHO");
        
//        System.out.println(map.size());
        System.out.println(mapVn.get("Hello"));
        
//        Set<String> keySet = mapJp.keySet();
//        Iterator<String> keys = keySet.iterator();
//        while (keys.hasNext()) {
//            String key = keys.next();
//            System.out.println(key + " - " + mapJp.get(key));
//        }
//        Set<Integer> mySet = new TreeSet<>();
////        Set<Integer> mySet = new HashSet<>();
//        mySet.add(2);
//        mySet.add(20);
//        mySet.add(2020);
//        mySet.add(2022);
//        mySet.add(202);
//        mySet.add(2021);
//
//        
//        System.out.println("size = "+mySet.size());
//        System.out.println("-----");
//        Iterator<Integer> iterator = mySet.iterator();
//        
//        while(iterator.hasNext()) {
//            Integer next = iterator.next();    
//            System.out.println(next);
//        }
//        Integer next2 = iterator.next();
//        Integer next3 = iterator.next();
//        Integer next4 = iterator.next();
//
//        
//        System.out.println(next2);
//        System.out.println(next3);
//        System.out.println(next4);
        
    }
    
}
