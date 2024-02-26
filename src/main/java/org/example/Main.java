package org.example;

import java.util.Random;

public class Main {
  private static Random random = new Random();
  public static void main(String[] args) {
    getResume(
        "Иванов",
        "Кирилл",
        "Иванович"
    );
    getResume(
        "Сидоров",
        "Егор",
        "Михайлович",
        31,
        "Прораб"
    );
    getResume(
        "Петров",
        "Никита",
        "Олегович",
        26,
        "Механик",
        1.5f
    );

    // generate array
    int size = random.nextInt(1, 20);
    final int[] array = new int[size];
    System.out.println("size array: " + array.length);
    for (int i = 0; i <= (array.length - 1); i++) {
      array[i] = random.nextInt(1, 30);
      System.out.println("arrayFisrt (" + i + ") = " + array[i]);
    }
    System.out.println("Summ array = " + func(array, array.length-1));

  }

  static int func(int[] array, int i){
    if (i < 0) {
      return 0;
    } else {
      return array[i] + func(array, --i);
    }
  }

  private static void getResume(
      String lastName,
      String firstName,
      String middleName
  ) {
    System.out.println(
        "Фамилия: " + lastName + ", " +
            "Имя: " + firstName + ", " +
            "Отчество: " + middleName
    );
  }

  private static void getResume(
      String lastName,
      String firstName,
      String middleName,
      int age,
      String profession
  ) {
    System.out.println(
        "Фамилия: " + lastName + ", " +
            "Имя: " + firstName + ", " +
            "Отчество: " + middleName + ", " +
            "Возраст: " + age + ", " +
            "Профессия: " + profession
    );
  }

  private static void getResume(
      String lastName,
      String firstName,
      String middleName,
      int age,
      String profession,
      float experience
  ) {
    System.out.println(
        "Фамилия: " + lastName + ", " +
            "Имя: " + firstName + ", " +
            "Отчество: " + middleName + ", " +
            "Возраст: " + age + ", " +
            "Профессия: " + profession + ", " +
            "Опыт: " + experience
    );
  }
}

