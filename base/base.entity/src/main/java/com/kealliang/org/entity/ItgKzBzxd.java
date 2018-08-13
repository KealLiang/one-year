package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;

import java.util.Date;

/**
 * 
 * 课组小店对应表
 * <pre>
 * 。
 * </pre>
 * 
 * @author developer developer@meicloud.com
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name = "t_itg_kz_bzxd")
public class ItgKzBzxd {

	private String itgKzBzxdId;
	
	/** 课组编码 */
	private String kzCode;
	
	/** 课组名称 */
	private String kzName;
	
	/** 段 */
	private String kzRange;
	
	/** 小店编码 */
	private String bzxdCode;
	
	/** 处理次数 */
	private String handleNum;
	
	/** 处理状态 */
	private String handleStatus;

	/** 创建时间 */
	private Date createDate;
	
	/** 创建人 */
	private String createBy;

	private String clusterFlag;
	
	public ItgKzBzxd() {
	}

	@HrmsId
	@HrmsGeneratedValue(strategy = HrmsGenerationType.UUID)
	public String getItgKzBzxdId() {
		return itgKzBzxdId;
	}

	public void setItgKzBzxdId(String itgKzBzxdId) {
		this.itgKzBzxdId = itgKzBzxdId;
	}

	public String getKzCode() {
		return kzCode;
	}

	public void setKzCode(String kzCode) {
		this.kzCode = kzCode;
	}

	public String getKzName() {
		return kzName;
	}

	public void setKzName(String kzName) {
		this.kzName = kzName;
	}

	public String getKzRange() {
		return kzRange;
	}

	public void setKzRange(String kzRange) {
		this.kzRange = kzRange;
	}

	public String getBzxdCode() {
		return bzxdCode;
	}

	public void setBzxdCode(String bzxdCode) {
		this.bzxdCode = bzxdCode;
	}

	public String getHandleNum() {
		return handleNum;
	}

	public void setHandleNum(String handleNum) {
		this.handleNum = handleNum;
	}

	public String getHandleStatus() {
		return handleStatus;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Override
	public String toString() {
		return "ItgKzBzxd [itgKzBzxdId=" + itgKzBzxdId + ", kzCode=" + kzCode + ", kzName=" + kzName + ", kzRange="
				+ kzRange + ", bzxdCode=" + bzxdCode + ", handleNum=" + handleNum + ", handleStatus=" + handleStatus
				+ ", createDate=" + createDate + ", createBy=" + createBy + "]";
	}

	public String getClusterFlag() {
		return clusterFlag;
	}

	public void setClusterFlag(String clusterFlag) {
		this.clusterFlag = clusterFlag;
	}
}
