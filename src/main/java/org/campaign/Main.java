package org.campaign;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.campaign.object.Account;

public class Main {
  public static void main(String[] args) {
    List<Account> account = new ArrayList<>();
    account.add(new Account().createAccount(true));
    account.add(new Account().createUser());
    account.add(new Account().createUser());
    account.add(new Account().createUser());
    account.add(new Account().createUser());

    account.forEach((id)-> System.out.println(id.getId()));

    Optional <Integer> maxId = account.stream().map(Account::getId).max(Integer::compare);
    System.out.println("Максимальный id аккаунта = " + maxId.get());
  }
}

