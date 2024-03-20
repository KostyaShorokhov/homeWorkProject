package org.campaign.object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.ZoneOffset.UTC;
import java.util.Random;
import org.campaign.interfaces.User;

public class Account extends BaseUser<Account> implements User {
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private Integer betaTest;
  private Boolean whiteListEnabled;
  private String title;
  private Boolean isMain = true;

  public Account() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getBetaTest() {
    return betaTest;
  }

  public void setBetaTest(Integer betaTest) {
    this.betaTest = betaTest;
  }

  public Boolean getWhiteListEnabled() {
    return whiteListEnabled;
  }

  public void setWhiteListEnabled(Boolean whiteListEnabled) {
    this.whiteListEnabled = whiteListEnabled;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean getMain() {
    return isMain;
  }

  public void setMain(Boolean main) {
    isMain = main;
  }

  public Account(
      int id,
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      Integer betaTest,
      Boolean whiteListEnabled,
      String title,
      Boolean isMain
  ) {
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.betaTest = betaTest;
    this.whiteListEnabled = whiteListEnabled;
    this.title = title;
    this.isMain = isMain;
  }

  public void updateUser(
      Account account,
      int discount,
      boolean whiteListEnabled,
      String title,
      boolean isMain
  ) {
    LocalDateTime today = LocalDate.now().atStartOfDay();
    if (today.atZone(UTC).toEpochSecond() < account.getCreatedAt().atOffset(UTC).toEpochSecond()) {
      System.out.println("Wrong date");
    } else {
      new Account(
          account.getId(),
          account.getCreatedAt(),
          today,
          0,
          true,
          title,
          isMain
      );
    }
  }

  @Override
  public Account createUser() {
    int rndNumber = new Random().nextInt(1, 20);
    LocalDateTime today = LocalDate.now().atStartOfDay();
    Account account = new Account();

    account.setId(rndNumber);
    account.setCreatedAt(today);
    account.setMain(false);
    account.setBetaTest(0);
    account.setTitle("Тест ЮЛ");
    account.setUpdatedAt(today);
    account.setWhiteListEnabled(true);
    account.setAdditionalInfo("Дополнительная информация");
    account.setBalance(2000);
    return account;
  }

  public Account createAccount(boolean isMain) {
    int rndNumber = new Random().nextInt(1, 20);
    LocalDateTime today = LocalDate.now().atStartOfDay();
    Account account = new Account();

    account.setId(rndNumber);
    account.setCreatedAt(today);
    account.setMain(isMain);
    account.setBetaTest(0);
    account.setTitle("Тест ЮЛ");
    account.setUpdatedAt(today);
    account.setWhiteListEnabled(true);

    return account;
  }
}
