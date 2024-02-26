package org.example;

public class Main {

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

