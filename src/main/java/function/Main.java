package function;

import function.interfaces.CheckInterface;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your number: ");
    int number = scanner.nextInt();
    CheckInterface checkNum = x -> x % 13 == 0;
    System.out.println(checkNum.checkNumber(number));
  }
}