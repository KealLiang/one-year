package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;

/**
 * 课组实体类
 * 
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
@HrmsTable(name="t_itg_kz")
public class Itgkz {

	/** 课组编码 */
	private String kzCode;
	
	/** 课组名称 */
	private String kzName;
	
	/** 段 */
	private String kzRange;
	
	/** 插入批次号 */
	private String batchCode;

	public Itgkz() {
	}

	@HrmsId
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

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
}
