package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    int summWeight = 0;
    int summ = 0;
    int n;
    for (n = 0; n < 6; n++) {
      System.out.print("Input number: ");
      int weight = number.nextInt();
      if ((summWeight += weight) <= 450) {
        summ += weight;
      } else {
        System.out.println("Limit weight 450, current weight = " + summWeight);
        break;
      }
      if (n < 6) {
      } else {
        System.out.println("Limit number of people = 6, current number = " + n);
        break;
      }
    }
    System.out.println("Summary number of people = " + n);
    System.out.println("Summary weight of people = " + summ);
  }
}