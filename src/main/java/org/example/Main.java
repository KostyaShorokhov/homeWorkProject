package org.example;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Integer[] arrayNums = new Integer[]{100, 201, 233, 400, 501, 662, 221, 410, 540};

    Arrays.stream(arrayNums).toList().forEach(currentNum -> {
      int first = currentNum / 100;
      int sec = currentNum / 10 % 10;
      int third = currentNum - (first * 100) - (sec * 10);
      //check condition 1
      if (third == 0) {
        // calc summ
        int summ = 0;
        int currentNumber = currentNum;
        do {
          summ = currentNumber % 2 == 0 ? summ + currentNumber : summ + (currentNumber - 1);
          currentNumber = currentNum - 2;
        } while (currentNumber == 1 || currentNumber == 0);
        // check condition 2
        if ((summ - 100 * (summ / 100) - 10 * (summ / 10 % 10)) == 0) {
          System.out.println("Number = " + currentNum);
        }
      }
    });
  }
}