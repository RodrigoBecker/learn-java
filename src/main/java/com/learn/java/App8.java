package com.learn.java;

import java.util.Scanner;

public class App8 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String password;

    System.out.println("Insert password for login: \n");
    password = sc.next();

    while (!password.equals("2022")) {
      System.out.println("Login Invalid");

      password = sc.next();
    }
    System.out.println("Login Success!!!");
    sc.close();
  }
}
