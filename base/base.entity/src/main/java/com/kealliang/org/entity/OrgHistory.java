package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;

import java.util.Date;

/**
 * <pre>
 * 表(t_org_history)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_history")
public class OrgHistory implements Auditable{

	private String orgHistoryId;
	private String orgUnitId;
	private String orgStandardId;
	private String orgUnitCode;
	private String orgType;
	private String operateType;
	private String parentId;
	private String path;
	private String orgUnitName;
	private String orgPathName;
	private String orgShortName;
	private Integer orgTier;
	private String reason;
	private String hiberarchy;
	private Date effectiveDate;
	private Date uneffectiveDate;
	private String city;
	private String state;
	private String country;
	private String orgLeaderId;
	private String orgResponsibility;
	private String createBy;
	private Date createDate;
	private String lastUpdateBy;
	private Date lastUpdateDate;
	private Date setupDate;
	private String orgPlate;
	private String orgBelongLevel;
	private String virtualUnit;
	private String abbreviation;
	private String remark;
	private String renameReason;
	private String flowCheckDetail;
	private String mdmOrgLevel;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgHistoryId() {
		return this.orgHistoryId;
	}
	public void setOrgHistoryId (String orgHistoryId) {
		this.orgHistoryId = orgHistoryId;
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getCreateBy() {
		return createBy;
	}

	@Override
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Override
	public Date getCreateDate() {
		return createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getHiberarchy() {
		return hiberarchy;
	}

	public void setHiberarchy(String hiberarchy) {
		this.hiberarchy = hiberarchy;
	}

	@Override
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	@Override
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Override
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	@Override
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}


	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrgBelongLevel() {
		return orgBelongLevel;
	}

	public void setOrgBelongLevel(String orgBelongLevel) {
		this.orgBelongLevel = orgBelongLevel;
	}

	public String getOrgLeaderId() {
		return orgLeaderId;
	}

	public void setOrgLeaderId(String orgLeaderId) {
		this.orgLeaderId = orgLeaderId;
	}

	public String getOrgPathName() {
		return orgPathName;
	}

	public void setOrgPathName(String orgPathName) {
		this.orgPathName = orgPathName;
	}

	public String getOrgPlate() {
		return orgPlate;
	}

	public void setOrgPlate(String orgPlate) {
		this.orgPlate = orgPlate;
	}

	public String getOrgResponsibility() {
		return orgResponsibility;
	}

	public void setOrgResponsibility(String orgResponsibility) {
		this.orgResponsibility = orgResponsibility;
	}

	public String getOrgShortName() {
		return orgShortName;
	}

	public void setOrgShortName(String orgShortName) {
		this.orgShortName = orgShortName;
	}


	public String getOrgStandardId() {
		return orgStandardId;
	}

	public void setOrgStandardId(String orgStandardId) {
		this.orgStandardId = orgStandardId;
	}

	public Integer getOrgTier() {
		return orgTier;
	}

	public void setOrgTier(Integer orgTier) {
		this.orgTier = orgTier;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getOrgUnitCode() {
		return orgUnitCode;
	}

	public void setOrgUnitCode(String orgUnitCode) {
		this.orgUnitCode = orgUnitCode;
	}

	public String getOrgUnitId() {
		return orgUnitId;
	}

	public void setOrgUnitId(String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}

	public String getOrgUnitName() {
		return orgUnitName;
	}

	public void setOrgUnitName(String orgUnitName) {
		this.orgUnitName = orgUnitName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getSetupDate() {
		return setupDate;
	}

	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getUneffectiveDate() {
		return uneffectiveDate;
	}

	public void setUneffectiveDate(Date uneffectiveDate) {
		this.uneffectiveDate = uneffectiveDate;
	}

	public String getVirtualUnit() {
		return virtualUnit;
	}

	public void setVirtualUnit(String virtualUnit) {
		this.virtualUnit = virtualUnit;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRenameReason() {
		return renameReason;
	}

	public void setRenameReason(String renameReason) {
		this.renameReason = renameReason;
	}
	public String getFlowCheckDetail() {
		return flowCheckDetail;
	}
	public void setFlowCheckDetail(String flowCheckDetail) {
		this.flowCheckDetail = flowCheckDetail;
	}
	public String getMdmOrgLevel() {
		return mdmOrgLevel;
	}
	public void setMdmOrgLevel(String mdmOrgLevel) {
		this.mdmOrgLevel = mdmOrgLevel;
	}
	
}
