package com.jsb.practice.corejava;

//import java.util.HashMap;

import com.netflix.spectator.api.Functions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class StringManipulation {


    public static void sample() {
        Scanner sc = new Scanner(System.in);
        String smp = sc.nextLine();


        System.out.println();

        sc.close();
    }

    public static void stringManipulation001() {
        String str = "There is a camel in the house";

Map<Character, Long> st = str.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(c -> Character.isAlphabetic(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(st);
//
//        str.chars().mapToObj(c-> (char)c).filter(c->Character.isAlphabetic())./
//        List<Character> ab = str.chars().mapToObj(i -> (char) i).flatMap();
//        HashMap<Character, Integer> mp = new HashMap<>();
//        for(Character f : ab){
//            if(mp.containsKey(f)){
//                int a = mp.get(f);
//                mp.put(f, a+1);
//            }
//            else{
//                mp.put(f,1);
//            }
//        }
//        System.out.println(mp);
    }

    public static void main(String[] args) {
        stringManipulation001();
//    sample();
    }
}