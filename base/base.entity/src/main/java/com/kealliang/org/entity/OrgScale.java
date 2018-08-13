package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;

/**
 * <pre>
 * 表(t_org_scale)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_scale")
public class OrgScale implements Auditable {
	
	private String orgScaleId;
	private String orgUnitId;
	private String scaleYear;
	private String scaleBudget;
	private String actualNum;
	private String costBudget;
	private Integer orderNo;
	private String status;
	private String createBy;
	private java.util.Date createDate;
	private String lastUpdateBy;
	private java.util.Date lastUpdateDate;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgScaleId() {
		return this.orgScaleId;
	}
	public void setOrgScaleId (String orgScaleId) {
		this.orgScaleId = orgScaleId;
	}
	public String getOrgUnitId() {
		return this.orgUnitId;
	}
	public void setOrgUnitId (String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}
	public String getScaleYear() {
		return this.scaleYear;
	}
	public void setScaleYear (String scaleYear) {
		this.scaleYear = scaleYear;
	}
	public String getScaleBudget() {
		return this.scaleBudget;
	}
	public void setScaleBudget (String scaleBudget) {
		this.scaleBudget = scaleBudget;
	}
	public String getActualNum() {
		return this.actualNum;
	}
	public void setActualNum (String actualNum) {
		this.actualNum = actualNum;
	}
	public String getCostBudget() {
		return this.costBudget;
	}
	public void setCostBudget (String costBudget) {
		this.costBudget = costBudget;
	}
	public Integer getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo (Integer orderNo) {
		this.orderNo = orderNo;
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
