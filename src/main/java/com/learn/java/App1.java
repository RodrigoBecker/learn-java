package com.learn.java;

import java.util.Scanner;

/**
 * Make program use mod
 *
 */
public class App1 {
  public static void main(String[] args) {

    int numb;
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert number \n");
    numb = sc.nextInt();
    sc.close();

    if (numb >= 0) {

      if (numb % 2 == 0) {
        System.out.println("Result is even");
      } else {
        System.out.println("Result is odd");
      }
    } else {
      System.out.println("is negative number");
    }

  }
}
