package org.campaign;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.campaign.object.Account;

public class Main {

  public static void main(String[] args) {
    List<Account> account = new ArrayList<>();
    account.add(new Account().createAccount(true));
    account.add(new Account.Builder()
        .setId(new Random().nextInt(1, 20))
        .setMain(false)
        .setBetaTest(1)
        .setTitle("Создан через билдер")
        .setCreatedAt(LocalDateTime.now())
        .setUpdatedAt(LocalDateTime.now())
        .build());
    account.add(new Account().createUser());
    account.add(new Account().createUser());
    account.add(new Account().createUser());

    account.forEach((id) -> System.out.println("AccountId = " + id.getId()));
    Iterator<Account> title = account.iterator();
    System.out.println("Работа итератора:");
    while (title.hasNext()) {
      System.out.println(title.next().getTitle());
    }

    String getBuilderTitle = account.stream().filter((t) -> "Создан через билдер".equals(t.getTitle())).toList().get(0).getTitle();
    System.out.println("Имя аккаунта через билдер = " + getBuilderTitle);
  }
}

