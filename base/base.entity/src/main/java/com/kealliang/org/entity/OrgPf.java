package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;
/**
 * <pre>
 * 表(t_org_pf)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_pf")
public class OrgPf implements Auditable{
	
	private String orgPfId;
	private String bussinessId;
	private String bussinessType;
	private String bussinessData;
	private String processInstanceId;
	private String processData;
	private String processStatus;
	private String createBy;
	private java.util.Date createDate;
	private String lastUpdateBy;
	private java.util.Date lastUpdateDate;
	private String fontData;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgPfId() {
		return this.orgPfId;
	}
	public void setOrgPfId (String orgPfId) {
		this.orgPfId = orgPfId;
	}
	public String getBussinessId() {
		return this.bussinessId;
	}
	public void setBussinessId (String bussinessId) {
		this.bussinessId = bussinessId;
	}
	public String getBussinessType() {
		return this.bussinessType;
	}
	public void setBussinessType (String bussinessType) {
		this.bussinessType = bussinessType;
	}
	public String getBussinessData() {
		return this.bussinessData;
	}
	public void setBussinessData (String bussinessData) {
		this.bussinessData = bussinessData;
	}
	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId (String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public String getProcessData() {
		return this.processData;
	}
	public void setProcessData (String processData) {
		this.processData = processData;
	}
	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus (String processStatus) {
		this.processStatus = processStatus;
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

	public String getFontData() {
		return fontData;
	}

	public void setFontData(String fontData) {
		this.fontData = fontData;
	}
}
