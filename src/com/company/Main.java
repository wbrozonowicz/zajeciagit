package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
}
