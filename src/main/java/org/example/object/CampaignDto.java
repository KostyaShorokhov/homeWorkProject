package org.example.object;

import java.time.LocalDateTime;
import org.example.enums.AdsStatusType;
import org.example.enums.CampaignBlockReason;
import org.example.enums.CampaignType;
import org.example.interfaces.Campaign;

public class CampaignDto implements Campaign {
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private Integer vacancyId;
  private String name;
  private AdsStatusType adsStatus;
  private CampaignType campaignType;
  private Integer budget;
  private Integer budgetDaily;
  private Boolean archivedVacancy;

  public CampaignBlockReason getBlockReason() {
    return blockReason;
  }

  public void setBlockReason(CampaignBlockReason blockReason) {
    this.blockReason = blockReason;
  }

  private CampaignBlockReason blockReason;
  private int accountId;

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

  public Integer getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(Integer vacancyId) {
    this.vacancyId = vacancyId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdsStatusType getAdsStatus() {
    return adsStatus;
  }

  public void setAdsStatus(AdsStatusType adsStatus) {
    this.adsStatus = adsStatus;
  }

  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public Integer getBudget() {
    return budget;
  }

  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  public Integer getBudgetDaily() {
    return budgetDaily;
  }

  public void setBudgetDaily(Integer budgetDaily) {
    this.budgetDaily = budgetDaily;
  }

  public Boolean getArchivedVacancy() {
    return archivedVacancy;
  }

  public void setArchivedVacancy(Boolean archivedVacancy) {
    this.archivedVacancy = archivedVacancy;
  }

  public CampaignType getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
  }

  @Override
  public void updateCampaign(CampaignDto campaignDto) {
  }

  @Override
  public void blockCampaign(CampaignDto campaignDto) {

  }

  @Override
  public CampaignDto createCampaign(
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
  ) {
    CampaignDto campaignDto = new CampaignDto();
    campaignDto.setId(id);
    campaignDto.setCreatedAt(createdAt);
    campaignDto.setUpdatedAt(updatedAt);
    campaignDto.setVacancyId(vacancyId);
    campaignDto.setName(name);
    campaignDto.setAdsStatus(adsStatus);
    campaignDto.setCampaignType(campaignType);
    campaignDto.setBudget(budget);
    campaignDto.setBudgetDaily(budgetDaily);
    campaignDto.setArchivedVacancy(archivedVacancy);
    campaignDto.setBlockReason(blockReason);
    campaignDto.setAccountId(accountId);
    return campaignDto;
  }
}
