package org.example.object;

import org.example.interfaces.User;

abstract class ClickmeUser implements User {
  private int userId;
  private int accountId;
  protected Account account;
  private Boolean admin;
  private String name;
  private String firstName;
  private String middleName;
  private String lastName;
  private String email;
  private Integer employerId;
  private Integer managerId;
  private static String managerEmail = "test@test.ru";
  private Boolean disableManagerUpdate;

  public Integer getEmployerId() {
    return employerId;
  }

  public void setEmployerId(Integer employerId) {
    this.employerId = employerId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Integer getManagerId() {
    return managerId;
  }

  public void setManagerId(Integer managerId) {
    this.managerId = managerId;
  }

  public String getManagerEmail() {
    return managerEmail;
  }

  public Boolean getDisableManagerUpdate() {
    return disableManagerUpdate;
  }

  public void setDisableManagerUpdate(Boolean disableManagerUpdate) {
    this.disableManagerUpdate = disableManagerUpdate;
  }

  @Override
  public Account createUser() {
    System.out.println("Создаем пользователя");
    return null;
  }

}
