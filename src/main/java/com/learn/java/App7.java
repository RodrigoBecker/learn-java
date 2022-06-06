package com.learn.java;

import java.util.Scanner;

public class App7 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insert Number: \n");
    int x = sc.nextInt();
    int soma = 0;
    while (x != 0) {
      soma += x;
      x = sc.nextInt();

      System.out.printf("Number is different zero! %d %n", soma);
    }
    sc.close();
  }

}
