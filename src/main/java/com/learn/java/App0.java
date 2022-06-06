package com.learn.java;

import java.util.Locale;
import java.util.Scanner;

public class App0 {

  public static void main(String[] args) {

    byte agency = 124; // type number primitive integer (8 Bits)
    short number = 121; // type number primitive integer (16 bits)
    int account = 3232; // type number primitive integer (32 bits)
    long numb = 2332; // type number primitive integer (64 bits)

    float amount = 2303; // type primitive float (32 bits)
    double transferAmount = 2330.09; // type primitive float (64 bits)

    char letter = 'c'; // type caracter Unicode ( 16 bits)
    boolean decision = true; // type boolean (1 bit)

    String name = "My Name is Luke"; // Type array caracter

    // pattern CamelCase sintaxe name variables

    boolean accountBalance = false;

    System.out.println("Hello World");
    System.out.println("Add breakline");
    System.out.println(name);
    System.out.printf("%.2f \n", transferAmount);
    System.out.printf("%.1f%n", transferAmount);
    Locale.setDefault(Locale.US); // mat float with locale;

    System.out.printf("Result is %.2f %n", transferAmount);
    System.out.printf("Result is %.1f where name is %s", transferAmount, name);

    // input data

    Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next();
    System.out.println("You digit: " + x);

    // conditions if / else

    int age;
    age = sc.nextInt();
    System.out.println("How old are you?");
    sc.close();

    if (age < 16) {
      System.out.println("not acess!!");
    } else {
      if (age > 50) {
        System.out.println("Not access, you is old!");
      } else {
        System.out.println("Access allowed!");
      }
    }

  }

}
