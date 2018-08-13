package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;
/**
 * <pre>
 * 表(t_org_corporation)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_corporation")
public class OrgCorporation implements Auditable{
	
	private String orgCorporationId;
	private String orgUnitId;
	private String orgCorporationCode;
	private String name;
	private String payer;
	private String payee;
	private String payeeBankName;
	private String payeeBankCode;
	private String status;
	private String createBy;
	private java.util.Date createDate;
	private String lastUpdateBy;
	private java.util.Date lastUpdateDate;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgCorporationId() {
		return this.orgCorporationId;
	}
	public void setOrgCorporationId (String orgCorporationId) {
		this.orgCorporationId = orgCorporationId;
	}
	public String getOrgUnitId() {
		return this.orgUnitId;
	}
	public void setOrgUnitId (String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}
	public String getOrgCorporationCode() {
		return this.orgCorporationCode;
	}
	public void setOrgCorporationCode (String orgCorporationCode) {
		this.orgCorporationCode = orgCorporationCode;
	}
	public String getName() {
		return this.name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getPayer() {
		return this.payer;
	}
	public void setPayer (String payer) {
		this.payer = payer;
	}
	public String getPayee() {
		return this.payee;
	}
	public void setPayee (String payee) {
		this.payee = payee;
	}
	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	public void setPayeeBankName (String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeBankCode() {
		return this.payeeBankCode;
	}
	public void setPayeeBankCode (String payeeBankCode) {
		this.payeeBankCode = payeeBankCode;
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
