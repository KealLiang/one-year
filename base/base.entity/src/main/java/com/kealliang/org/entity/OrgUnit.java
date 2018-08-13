package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;

import java.util.Date;

/**
 * <pre>
 * 表(t_org_unit)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_unit")
public class OrgUnit implements Auditable {
	
	private String orgUnitId;
	private String orgStandardId;
	private String orgUnitCode;
	private String parentId;
	private String path;
	private String orgUnitName;
	private String orgPathName;
	private String orgShortName;
	private Integer orgTier;
	private Integer orderNo;
	private String hiberarchy;
	private Date effectiveDate;
	private String status;
	private String createBy;
	private Date createDate;
	private String lastUpdateBy;
	private Date lastUpdateDate;
	private Date setupDate;
	private String orgType;
	private String orgPlate;
	private String orgBelongLevel;
	private String virtualUnit;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgUnitId() {
		return this.orgUnitId;
	}
	public void setOrgUnitId (String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}
	public String getOrgStandardId() {
		return this.orgStandardId;
	}
	public void setOrgStandardId (String orgStandardId) {
		this.orgStandardId = orgStandardId;
	}
	public String getOrgUnitCode() {
		return this.orgUnitCode;
	}
	public void setOrgUnitCode (String orgUnitCode) {
		this.orgUnitCode = orgUnitCode;
	}
	public String getParentId() {
		return this.parentId;
	}
	public void setParentId (String parentId) {
		this.parentId = parentId;
	}
	public String getPath() {
		return this.path;
	}
	public void setPath (String path) {
		this.path = path;
	}
	public String getOrgUnitName() {
		return this.orgUnitName;
	}
	public void setOrgUnitName (String orgUnitName) {
		this.orgUnitName = orgUnitName;
	}
	public String getOrgPathName() {
		return this.orgPathName;
	}
	public void setOrgPathName (String orgPathName) {
		this.orgPathName = orgPathName;
	}
	public String getOrgShortName() {
		return this.orgShortName;
	}
	public void setOrgShortName (String orgShortName) {
		this.orgShortName = orgShortName;
	}
	public Integer getOrgTier() {
		return this.orgTier;
	}
	public void setOrgTier (Integer orgTier) {
		this.orgTier = orgTier;
	}
	public String getHiberarchy() {
		return this.hiberarchy;
	}
	public void setHiberarchy (String hiberarchy) {
		this.hiberarchy = hiberarchy;
	}
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate (Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus (String status) {
		this.status = status;
	}
	public String getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy (String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate (Date createDate) {
		this.createDate = createDate;
	}
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}
	public void setLastUpdateBy (String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}
	public void setLastUpdateDate (Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getOrgBelongLevel() {
		return orgBelongLevel;
	}

	public void setOrgBelongLevel(String orgBelongLevel) {
		this.orgBelongLevel = orgBelongLevel;
	}

	public String getOrgPlate() {
		return orgPlate;
	}

	public void setOrgPlate(String orgPlate) {
		this.orgPlate = orgPlate;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public Date getSetupDate() {
		return setupDate;
	}

	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}

	public String getVirtualUnit() {
		return virtualUnit;
	}

	public void setVirtualUnit(String virtualUnit) {
		this.virtualUnit = virtualUnit;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
}
