package com.kealliang.org.entity;

import java.util.Date;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
import com.meicloud.sahara.orm.entity.Auditable;

/**
 * 
 * <pre>
 * 标准组织实体类。
 * </pre>
 * 
 * @author huangyishen yishen.huang@meicloud.com
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录:
 * 修改后版本:
 * 修改人:
 * 修改日期:
 * 修改内容:
 *          </pre>
 */
@HrmsEntity
@HrmsTable(name = "t_org_standard")
public class OrgStandard implements Auditable{
	// 标准组织id
	private String orgStandardId;
	// 组织类型,字典值
	private String orgType;
	// 标准组织编码
	private String orgStandardCode;
	// 标准组织名称
	private String orgStandardName;
	// 业态,使用数据字典
	private String businessType;
	// 生效时间
	private Date effectiveDate;
	// 失效日期
	private Date uneffectiveDate;
	// 组织职责
	private String responsibility;
	// 是否可改名 1是,0否
	private String renameable;
	// 状态,0禁用, 1启用, 2冻结, 3暂存, 4流程中
	private String status;
	// 创建人
	private String createBy;
	// 创建时间
	private Date createDate;
	// 最后更新人
	private String lastUpdateBy;
	// 最后更新时间
	private Date lastUpdateDate;
	//小店类型
	private String shopType;

	@HrmsId
	@HrmsGeneratedValue(strategy = HrmsGenerationType.UUID)
	public String getOrgStandardId() {
		return orgStandardId;
	}

	public void setOrgStandardId(String orgStandardId) {
		this.orgStandardId = orgStandardId == null ? null : orgStandardId.trim();
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType == null ? null : orgType.trim();
	}

	public String getOrgStandardCode() {
		return orgStandardCode;
	}

	public void setOrgStandardCode(String orgStandardCode) {
		this.orgStandardCode = orgStandardCode == null ? null : orgStandardCode.trim();
	}

	public String getOrgStandardName() {
		return orgStandardName;
	}

	public void setOrgStandardName(String orgStandardName) {
		this.orgStandardName = orgStandardName == null ? null : orgStandardName.trim();
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType == null ? null : businessType.trim();
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getUneffectiveDate() {
		return uneffectiveDate;
	}

	public void setUneffectiveDate(Date uneffectiveDate) {
		this.uneffectiveDate = uneffectiveDate;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility == null ? null : responsibility.trim();
	}

	public String getRenameable() {
		return renameable;
	}

	public void setRenameable(String renameable) {
		this.renameable = renameable == null ? null : renameable.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
}