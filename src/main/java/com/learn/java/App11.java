package com.learn.java;

import java.util.Scanner;

public class App11 {

  public static void main(String[] args) {

    double x = Math.sqrt(25);
    System.out.println(x);

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert number One: ");
    int a = sc.nextInt();
    System.out.println("Insert number Two: ");
    int b = sc.nextInt();
    System.out.println("Insert number Three: ");
    int c = sc.nextInt();

    int higher = max(a, b, c);

    showResut(higher);

    sc.close();

  }

  public static int max(int x, int y, int z) {
    int aux;

    if (x > y && x > z) {
      aux = x;
    } else if (y > z) {
      aux = y;
    } else {
      aux = z;
    }
    return aux;
  }

  public static void showResut(int value) {
    System.out.println("Result is: " + value);
  }

}
