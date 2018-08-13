package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
/**
 * <pre>
 * 表(t_org_maintain)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_maintain")
public class OrgMaintain{
	
	private String orgMaintainId;
	private String orgUnitId;
	private String abbreviation;
	private String city;
	private String state;
	private String country;
	private String orgLeaderId;
	private String orgResponsibility;
	private String remark;
	private String renameReason;
	private String flowCheckDetail;
	private String mdmOrgLevel;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgMaintainId() {
		return this.orgMaintainId;
	}
	public void setOrgMaintainId (String orgMaintainId) {
		this.orgMaintainId = orgMaintainId;
	}
	public String getOrgUnitId() {
		return this.orgUnitId;
	}
	public void setOrgUnitId (String orgUnitId) {
		this.orgUnitId = orgUnitId;
	}

	public String getOrgLeaderId() {
		return this.orgLeaderId;
	}
	public void setOrgLeaderId (String orgLeaderId) {
		this.orgLeaderId = orgLeaderId;
	}
	public String getOrgResponsibility() {
		return this.orgResponsibility;
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


	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
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

	public void setOrgResponsibility(String orgResponsibility) {
		this.orgResponsibility = orgResponsibility;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
