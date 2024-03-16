package discriminant;

import java.util.Scanner;
import discriminant.interfaces.CheckDiscriminant;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input side a: ");
    float a = scanner.nextFloat();
    System.out.print("Input side b: ");
    float b = scanner.nextFloat();
    System.out.print("Input side c: ");
    float c = scanner.nextFloat();
    CheckDiscriminant<Float> calc = (a1, b1, c1) -> ((b1 * b1) - (4 * a1 * c1));
    System.out.println("Discriminant = " + calc.calcDisc(a, b, c));
  }
}
