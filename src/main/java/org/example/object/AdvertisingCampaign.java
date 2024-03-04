package org.example.object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.example.enums.AdsStatusType;
import org.example.enums.CampaignType;

public class AdvertisingCampaign extends CampaignDto {
  private static String nameCampaign = "Тест ";

  public CampaignDto createAdvertisingCampaign(
      int id,
      Integer vacancyId,
      String name,
      Integer budget,
      Integer budgetDaily,
      int accountId
  ) {
    LocalDateTime dateNow = LocalDate.now().atStartOfDay();
    CampaignDto campaignDto = new CampaignDto().createCampaign(
        id,
        dateNow,
        dateNow,
        vacancyId,
        nameCampaign + name,
        AdsStatusType.ACTIVE,
        CampaignType.ADVERTISING,
        budget,
        budgetDaily,
        false,
        null,
        accountId
    );
  return campaignDto;
  }
}
