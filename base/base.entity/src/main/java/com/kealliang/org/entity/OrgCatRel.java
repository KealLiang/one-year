package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsGeneratedValue;
import com.meicloud.sahara.orm.annotation.HrmsGenerationType;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;
/**
 * <pre>
 * 表(t_org_cat_rel)实体类
 * </pre>
 * @author developer developer@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_cat_rel")
public class OrgCatRel{
	
	private String orgCatRelId;
	private String orgStandardId;
	private String posCategoryId;

	@HrmsId
	@HrmsGeneratedValue(strategy=HrmsGenerationType.UUID)
	public String getOrgCatRelId() {
		return this.orgCatRelId;
	}
	public void setOrgCatRelId (String orgCatRelId) {
		this.orgCatRelId = orgCatRelId;
	}
	public String getOrgStandardId() {
		return this.orgStandardId;
	}
	public void setOrgStandardId (String orgStandardId) {
		this.orgStandardId = orgStandardId;
	}
	public String getPosCategoryId() {
		return this.posCategoryId;
	}
	public void setPosCategoryId (String posCategoryId) {
		this.posCategoryId = posCategoryId;
	}
}
