package org.example;

public class Main {

  public static void main(String[] args) throws Exception {
    try {
      checkUser(
          "недопустимый логин",
          "pas1s",
          "pass"
      );
    } catch (WrongLoginException|WrongPasswordException e) {
    }
  }

  private static boolean checkUser(
      String login,
      String password,
      String confirmPassword
  ) throws Exception, WrongPasswordException {
    boolean check = true;
    try {
      check = login.matches("^[a-zA-Z0-9_]+$") && login.length() <= 20;
    } catch (Exception e) {
      throw new WrongLoginException(String.format("Login = %s, is incorrect, please correct input", login));
    }
    try {
      check = password.matches("^[a-zA-Z0-9_]+$") && password.length() <= 20;
    } catch (Exception e) {
      throw new WrongPasswordException(String.format("Password = %s, is incorrect, please correct input", password));
    }

    try {
      check = password.matches("^[a-zA-Z0-9_]+$") && password.length() <= 20 && password.equals(confirmPassword);
    } catch (Exception e) {
      throw new WrongPasswordException(String.format("Password = %s, is incorrect, please correct input", password));
    }
    return check= true;
  }
}