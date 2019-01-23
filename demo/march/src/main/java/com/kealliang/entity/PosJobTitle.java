package com.kealliang.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;

import java.util.Date;

/**
 *@ClassName   PosJobTitle
 *@Description 职务
 *@Author LIYY51
 *@Date 2018-10-13 14:49
 *@Version 1.0.0
 **/
@HrmsEntity
@HrmsTable(name="t_pos_job_title")
public class PosJobTitle implements Auditable<Integer> {

  private Integer jobTitleId;
  private String jobTitleCode;
  private String jobTitleName;
  private String description;
  private Date createDate;
  private Integer createBy;
  private Date lastUpdateDate;
  private Integer lastUpdateBy;

  @HrmsId
  @HrmsGeneratedValue(strategy= HrmsGenerationType.AUTO)
  public Integer getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(Integer jobTitleId) {
    this.jobTitleId = jobTitleId;
  }

  public String getJobTitleCode() {
    return jobTitleCode;
  }

  public void setJobTitleCode(String jobTitleCode) {
    this.jobTitleCode = jobTitleCode;
  }

  public String getJobTitleName() {
    return jobTitleName;
  }

  public void setJobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  public Integer getCreateBy() {
    return createBy;
  }

  public void setCreateBy(Integer createBy) {
    this.createBy = createBy;
  }


  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public Integer getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(Integer lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }


  public static final class PosJobTitleBuilder {
    private PosJobTitle posJobTitle;

    private PosJobTitleBuilder() {
      posJobTitle = new PosJobTitle();
    }

    public static PosJobTitleBuilder aPosJobTitle() {
      return new PosJobTitleBuilder();
    }

    public PosJobTitleBuilder withJobTitleId(Integer jobTitleId) {
      posJobTitle.setJobTitleId(jobTitleId);
      return this;
    }

    public PosJobTitleBuilder withJobTitleCode(String jobTitleCode) {
      posJobTitle.setJobTitleCode(jobTitleCode);
      return this;
    }

    public PosJobTitleBuilder withJobTitleName(String jobTitleName) {
      posJobTitle.setJobTitleName(jobTitleName);
      return this;
    }

    public PosJobTitleBuilder withDescription(String description) {
      posJobTitle.setDescription(description);
      return this;
    }

    public PosJobTitleBuilder withCreateDate(Date createDate) {
      posJobTitle.setCreateDate(createDate);
      return this;
    }

    public PosJobTitleBuilder withCreateBy(Integer createBy) {
      posJobTitle.setCreateBy(createBy);
      return this;
    }

    public PosJobTitleBuilder withLastUpdateDate(Date lastUpdateDate) {
      posJobTitle.setLastUpdateDate(lastUpdateDate);
      return this;
    }

    public PosJobTitleBuilder withLastUpdateBy(Integer lastUpdateBy) {
      posJobTitle.setLastUpdateBy(lastUpdateBy);
      return this;
    }

    public PosJobTitle build() {
      return posJobTitle;
    }
  }
}
