package com.jsb.practice.corejava;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Task {


    public static Comparator<String> sortPerLength(){
        Comparator<String> nu = new Comparator<String>() {
            public int compare(String a, String b) {
                if (b.length() > a.length()) {
                    return 1;
                } else if (b.length() < a.length()) {
                    return -1;
                } else {
                    return a.compareTo(b);
                }
            }
        };
      return nu;
//        Arrays.sort(arr, (a,b) -> b.length() - a.length());
    }

    public static void patternPrinting(String arr){
        String[] arr1 = partition(arr);
        List<String> lst = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(lst, sortPerLength());
        String[] arr2 = lst.toArray(new String[0]);
        int maxLength = arr2[0].length();
        for(int i=0;i<arr2.length;i++){
            int numSpace = maxLength - arr2[i].length();
            while(numSpace>0){
                System.out.print(" ");
                numSpace--;
            }
            System.out.print(arr2[i]);
            System.out.println();
        }
    }

    public static void patternStarPrinting(String arr){
        String[] arr1 = partition(arr);
        List<String> lst = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(lst, sortPerLength());
        String[] arr2 = lst.toArray(new String[0]);
        int maxLength = arr2[0].length();
        for(int i=0;i<arr2.length;i++){
            int numSpace = maxLength - arr2[i].length();
            if(i%2==0){
            while(numSpace>0){
                System.out.print(" ");
                numSpace--;
            }
            }
            for(int x=0;x<arr2[i].length();x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void centerPattern(String arr){
        String[] arr1 = partition(arr);
        List<String> lst = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(lst, sortPerLength());
        String[] arr2 = lst.toArray(new String[0]);
        for(int i=0;i<arr2.length;i++){
            int maxLength = arr2[0].length();
            int space = maxLength - arr2[i].length();
            space/=2;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            int star = arr2[i].length();
            while (star>0) {
                System.out.print("*");
                star--;
            }
            System.out.println();
        }
    }

    public static void reversePatternStarPrinting(String arr){
        String[] arr1 = partition(arr);
        List<String> lst = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(lst, sortPerLength());
        String[] arr2 = lst.toArray(new String[0]);
        int maxLength = arr2[0].length();
        for(int i=arr2.length-1;i>=0;i--){
            int numSpace = maxLength - arr2[i].length();
            for(int x=0;x<arr2[i].length();x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static String[] partition(String a){
        a=a.toLowerCase();
        String[] arr = a.split(" ");
        return arr;
    }

    public static void main(String[] args){

        String a = "This is a java programming";
        a=a.toLowerCase();
        String[] arr1 = a.split(" ");
        List<String> lst = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(lst, sortPerLength());
        String[] arr2 = lst.toArray(new String[0]);
        for(String l:arr2){
            System.out.println(l);
        }
        System.out.println("---------------------------------");
        patternPrinting("This is a java programming");
        System.out.println("---------------------------------");
        reversePatternStarPrinting("This is a java programming");
        System.out.println("---------------------------------");
        patternStarPrinting("This is a java programming");
        System.out.println("---------------------------------");
        centerPattern("This is a java programming");
        System.out.println("---------------------------------");
    }
}