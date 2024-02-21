package org.example;

import java.util.Scanner;
import static org.hamcrest.MatcherAssert.assertThat;

public class Main {
  static Integer number;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your number: ");
    number = scanner.nextInt();
    assertThat("The number is incorrect", number > 0 & number.toString().length() == 3);
    System.out.println(number + " is correct number!");
    int first = number / 100;
    int sec = number / 10 % 10;
    int third = number - (first * 100) - (sec * 10);
    System.out.println("result = " + (number > 500 ?
        String.valueOf(third) + sec + first :
        first + String.valueOf(third) + sec));
  }
}