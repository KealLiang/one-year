package com.kealliang.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;

/**
 * <pre>
 * 表(t_sys_url)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_sys_url")
public class SysUrl implements Auditable<Integer> {
	
	private Integer urlId;
	private String urlName;
	private String urlAddress;
	private String urlType;
	private String grantType;
	private String description;
	private java.util.Date createDate;
	private Integer createBy;
	private java.util.Date lastUpdateDate;
	private Integer lastUpdateBy;
	
	private String checkStatus;
	
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	@HrmsId
	@HrmsGeneratedValue(strategy = HrmsGenerationType.AUTO)
	public Integer getUrlId() {
		return this.urlId;
	}
	public void setUrlId (Integer urlId) {
		this.urlId = urlId;
	}
	public String getUrlName() {
		return this.urlName;
	}
	public void setUrlName (String urlName) {
		this.urlName = urlName;
	}
	public String getUrlAddress() {
		return this.urlAddress;
	}
	public void setUrlAddress (String urlAddress) {
		this.urlAddress = urlAddress;
	}
	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType (String urlType) {
		this.urlType = urlType;
	}
	public String getGrantType() {
		return this.grantType;
	}
	public void setGrantType (String grantType) {
		this.grantType = grantType;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription (String description) {
		this.description = description;
	}
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate (java.util.Date createDate) {
		this.createDate = createDate;
	}
	public Integer getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy (Integer createBy) {
		this.createBy = createBy;
	}
	public java.util.Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}
	public void setLastUpdateDate (java.util.Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Integer getLastUpdateBy() {
		return this.lastUpdateBy;
	}
	public void setLastUpdateBy (Integer lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
}
