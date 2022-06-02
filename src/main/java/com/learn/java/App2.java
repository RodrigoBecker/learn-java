package com.learn.java;

import java.util.Scanner;

/**
 * Verify multiple numbers
 */
public class App2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert number one: \n");
    int numberOne;
    numberOne = sc.nextInt();
    System.out.println("Insert number two: \n");
    int numberTwo;
    numberTwo = sc.nextInt();
    sc.close();

    if (numberOne % numberTwo == 0 || numberTwo % numberOne == 0) {
      System.out.println("The numbers are multiples!");
    } else {
      System.out.println("The numbers is not multiples!");
    }

  }

}
