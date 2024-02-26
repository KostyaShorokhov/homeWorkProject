package org.example;

import java.util.Random;

public class Main {
  static int size;
  static Random random = new Random();

  public static void main(String[] args) {
    size = random.nextInt(1, 5);
    final int[] arrayFirst = new int[size];
    System.out.println("size arrayFirst: " + arrayFirst.length);
    for (int i = 0; i <= (arrayFirst.length - 1); i++) {
      arrayFirst[i] = random.nextInt(1, 10);
      System.out.println("arrayFisrt (" + i + ") = " + arrayFirst[i]);
    }

    final int[] arraySecond = new int[size];
    System.out.println("size arraySecond: " + arraySecond.length);
    for (int i = 0; i <= (arraySecond.length - 1); i++) {
      arraySecond[i] = random.nextInt(1, 10);
      System.out.println("arraySecond (" + i + ") = " + arraySecond[i]);
    }

    //todo: print unique result (without repeat)
    System.out.println("result:");
    for (int i = 0; i < arrayFirst.length; i++) {
      for (int k : arraySecond) {
        if (arrayFirst[i] != k) {
          System.out.println("number #" + (i + 1) + " = " + arrayFirst[i]);
        }
      }
    }
  }
}