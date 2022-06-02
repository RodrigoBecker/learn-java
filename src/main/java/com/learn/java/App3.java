package com.learn.java;

import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    double positionX;
    double positionY;

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert position value x: \n");
    positionX = sc.nextDouble();
    System.out.println("Inset position value y: \n");
    positionY = sc.nextDouble();

    sc.close();

    if (positionX == 0.0 && positionY == 0.0) {

      System.out.println("Origin Position!");
    } else if (positionX < 0 && positionX < 0) {
      System.out.println("Quadrant #Q3");
    } else if (positionX < 0 && positionY > 0) {
      System.out.println("Quadrant #Q2");
    } else if (positionX > 0 && positionY < 0) {
      System.out.println("Quadrant #Q4");
    } else if (positionX > 0 && positionY > 0) {
      System.out.println("Quadrant #Q1");
    }
  }

}
