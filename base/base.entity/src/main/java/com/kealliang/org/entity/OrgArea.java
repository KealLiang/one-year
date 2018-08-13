package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;
/**
 * <pre>
 * 表(t_org_area)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_area")
public class OrgArea implements Auditable {
	
	private String areaId;
	private String areaName;
	private String areaCode;
	private String parentAreaId;
	private String areaType;
	private String isActive;
	private String areaDescription;
	private String createBy;
	private java.util.Date createDate;
	private String lastUpdateBy;
	private java.util.Date lastUpdateDate;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId (String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName (String areaName) {
		this.areaName = areaName;
	}
	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode (String areaCode) {
		this.areaCode = areaCode;
	}
	public String getParentAreaId() {
		return this.parentAreaId;
	}
	public void setParentAreaId (String parentAreaId) {
		this.parentAreaId = parentAreaId;
	}
	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType (String areaType) {
		this.areaType = areaType;
	}
	public String getIsActive() {
		return this.isActive;
	}
	public void setIsActive (String isActive) {
		this.isActive = isActive;
	}
	public String getAreaDescription() {
		return this.areaDescription;
	}
	public void setAreaDescription (String areaDescription) {
		this.areaDescription = areaDescription;
	}
	public String getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy (String createBy) {
		this.createBy = createBy;
	}
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate (java.util.Date createDate) {
		this.createDate = createDate;
	}
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}
	public void setLastUpdateBy (String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public java.util.Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}
	public void setLastUpdateDate (java.util.Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
