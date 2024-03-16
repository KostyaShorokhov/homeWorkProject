package org.campaign;

import org.campaign.object.Account;
import org.campaign.object.AdvertisingCampaign;
import org.campaign.object.CampaignDto;

public class Main {
  public static void main(String[] args) {
    Account account = new Account().createUser();

    CampaignDto campaign = new AdvertisingCampaign().createAdvertisingCampaign(
        1,
        1,
        "Тестовая",
        2000,
        5000,
        account.getId()
    );

    System.out.println("id компании = " + campaign.getId() + ", " +
        " тип компании = " + campaign.getCampaignType() + ", " +
        " id вакансии = " + campaign.getVacancyId() + ", " +
        " название компании = " + campaign.getName() + ", " +
        " статус компании = " + campaign.getAdsStatus() + ", " +
        " бюджет компании = " + campaign.getBudget() + ", " +
        " ежедневный бюджет = " + campaign.getBudgetDaily() + ", " +
        " id акканута = " + campaign.getAccountId()
    );
  }
}

