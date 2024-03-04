package org.example.interfaces;

import java.time.LocalDateTime;
import org.example.enums.AdsStatusType;
import org.example.enums.CampaignBlockReason;
import org.example.enums.CampaignType;
import org.example.object.CampaignDto;

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
