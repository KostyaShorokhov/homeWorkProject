package org.example;

public class WrongPasswordException extends Exception {
  public WrongPasswordException() {
  }

  public WrongPasswordException(String message) throws Exception {
    throw new Exception(message);
  }
}
