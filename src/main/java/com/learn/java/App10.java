package com.learn.java;

public class App10 {

  public static void main(String[] args) {

    String original = "abcdcd fghi ABCD";
    String s = "potato apple";
    String[] vect = s.split(" ");

    System.out.println("Original - " + original);
    System.out.println("toLowerCase - " + original.toLowerCase());
    System.out.println("toUpperCase - " + original.toUpperCase());
    System.out.println("trim -" + original.trim());
    System.out.println("substring - " + original.substring(4));
    System.out.println("substring(2,9) - " + original.substring(2, 9));
    System.out.println("replace - " + original.replace("abc", "xy"));
    System.out.println("indexOf bc - " + original.lastIndexOf("bc"));
    System.out.println("LastIndexOf bc -" + original.lastIndexOf("bc"));
    System.out.println("split - " + vect[0]);

  }

}
