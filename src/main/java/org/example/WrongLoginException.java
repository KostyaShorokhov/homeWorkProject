package org.example;

class WrongLoginException extends Exception {
  public WrongLoginException() {
  }

  WrongLoginException(String message) throws Exception {
    throw new Exception(message);
  }
}
