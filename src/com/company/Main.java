package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
    // write your code here
    ArrayList<String> arList = new ArrayList<>();
    arList.add("Maciek");
    arList.add("Tomek");
        System.out.println(arList);
for (int i = 0; i < 100; i++) {
    System.out.println(i);
}

Object1 nowyObj = new Object1("Wojtek");
nowyObj.showName();

        System.out.println("hii");
        System.out.println("another line");
        System.out.println("third line");
    }


    public static void print(){
        System.out.println("something...");
    }


    @Override
    public String toString() {
        return "Object main: "+super.toString();
    }

    public static void printArray(){
        System.out.println("array....");
    }


}
