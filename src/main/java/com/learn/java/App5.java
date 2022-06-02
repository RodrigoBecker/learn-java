package com.learn.java;

import java.util.Scanner;

public class App5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double price = 34.5;
    double off = (price < 20.0) ? price * 0.1 : price * 0.05;

    System.out.println(off);
    sc.close();
  }

}
