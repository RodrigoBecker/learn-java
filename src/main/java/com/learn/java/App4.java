package com.learn.java;

import java.util.Scanner;

/**
 * App4
 */
public class App4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x;
    String day;

    System.out.println("Insert number of week");
    x = sc.nextInt();

    // if / else if

    // if (x == 1) {
    // day = "Sunday";
    // } else if (x == 2) {
    // day = "Monday";
    // } else if (x == 3) {
    // day = "Tusday";
    // } else if (x == 4) {
    // day = "Wednesday";
    // } else if (x == 5) {
    // day = "Thursday";
    // } else if (x == 6) {
    // day = "Friday";
    // } else if (x == 7) {
    // day = "Sartuday";
    // } else {
    // day = "Undefine";
    // }

    switch (x) {
      case 1:
        day = "Sunday";
        break;
      case 2:
        day = "Monday";
        break;
      case 3:
        day = "Tusday";
        break;
      case 4:
        day = "Wednesday";
        break;
      case 5:
        day = "Thursday";
        break;
      case 6:
        day = "Friday";
        break;
      case 7:
        day = "Saturday";
        break;
      default:
        day = "Undefined";
    }

    System.out.println("Day of Week: " + day);
    sc.close();
  }
}
