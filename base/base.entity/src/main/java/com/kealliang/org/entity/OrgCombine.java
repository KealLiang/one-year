package com.kealliang.org.entity;

import java.util.Date;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;
/**
 * <pre>
 * 表(t_org_combine)实体类
 * </pre>
 * @author developer developer@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_combine")
public class OrgCombine implements Auditable{
	
	private String orgCombineId;
	private String orgCombineCode;
	private String orgUnitId;
	private Date effectiveDate;
	private Date uneffectiveDate;
	private String remark;
	private String status;
	private String createBy;
	private Date createDate;
	private String lastUpdateBy;
	private Date lastUpdateDate;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgCombineId() {
		return this.orgCombineId;
	}
	public void setOrgCombineId (String orgCombineId) {
		this.orgCombineId = orgCombineId;
	}
	public String getOrgCombineCode() {
		return this.orgCombineCode;
	}
	public void setOrgCombineCode (String orgCombineCode) {
		this.orgCombineCode = orgCombineCode;
	}
	public String getOrgUnitId() {
		return this.orgUnitId;
	}
	public void setOrgUnitId (String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate (Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getUneffectiveDate() {
		return this.uneffectiveDate;
	}
	public void setUneffectiveDate (Date uneffectiveDate) {
		this.uneffectiveDate = uneffectiveDate;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark (String remark) {
		this.remark = remark;
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
}
