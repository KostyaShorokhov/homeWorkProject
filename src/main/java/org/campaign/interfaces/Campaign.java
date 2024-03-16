package org.campaign.interfaces;

import java.time.LocalDateTime;
import org.campaign.enums.AdsStatusType;
import org.campaign.enums.CampaignBlockReason;
import org.campaign.enums.CampaignType;
import org.campaign.object.CampaignDto;

public interface Campaign {

  void updateCampaign(CampaignDto campaignDto);

  void blockCampaign(CampaignDto campaignDto);

  CampaignDto createCampaign(
      int id,
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      Integer vacancyId,
      String name,
      AdsStatusType adsStatus,
      CampaignType campaignType,
      Integer budget,
      Integer budgetDaily,
      Boolean archivedVacancy,
      CampaignBlockReason blockReason,
      int accountId
  );
}
