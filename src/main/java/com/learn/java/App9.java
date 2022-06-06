package com.learn.java;

import java.util.Scanner;

/**
 * App9
 */

public class App9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert number for condition: ");
    int N = sc.nextInt();
    int soma = 0;

    for (int i = 0; i < N; i++) {
      System.out.println("------------------");
      System.out.printf("Number liner is %d ", i);
      int x = sc.nextInt();
      soma += x;

    }
    sc.close();
  }

}
