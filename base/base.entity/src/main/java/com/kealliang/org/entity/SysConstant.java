package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
/**
 * <pre>
 * 表(t_sys_constant)实体类
 * </pre>
 * @author liangsr sirui.liang@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_sys_constant")
public class SysConstant{
	
	private String sysConstantId;
	private String constantKey;
	private String constantValue;
	private String description;

	private Integer version;
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getSysConstantId() {
		return this.sysConstantId;
	}
	public void setSysConstantId (String sysConstantId) {
		this.sysConstantId = sysConstantId;
	}
	public String getConstantKey() {
		return this.constantKey;
	}
	public void setConstantKey (String constantKey) {
		this.constantKey = constantKey;
	}
	public String getConstantValue() {
		return this.constantValue;
	}
	public void setConstantValue (String constantValue) {
		this.constantValue = constantValue;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription (String description) {
		this.description = description;
	}
}
