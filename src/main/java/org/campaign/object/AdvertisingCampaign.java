package org.campaign.object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.campaign.enums.AdsStatusType;
import org.campaign.enums.CampaignType;

public class AdvertisingCampaign extends CampaignDto {
  private static final String nameCampaign = "Тест ";

  public CampaignDto createAdvertisingCampaign(
      int id,
      Integer vacancyId,
      String name,
      Integer budget,
      Integer budgetDaily,
      int accountId
  ) {
    LocalDateTime dateNow = LocalDate.now().atStartOfDay();
    return new CampaignDto().createCampaign(
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
  }
}
