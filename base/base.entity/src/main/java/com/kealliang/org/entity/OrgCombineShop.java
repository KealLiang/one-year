package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;

import java.util.Date;

/**
 * <pre>
 * 表合并-门店(t_org_combine_shop)实体类
 * </pre>
 * @author ren.liao@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_combine_shop")
public class OrgCombineShop implements Auditable {
    private String orgCombineShopId; //'主键id',
    private String orgUnitId; // '门店id',
    private Date effectiveDate; // '生效日期',
    private Date uneffectiveDate; //'失效日期',
    private String remark; // '备注',
    private String status; // '状态,0禁用, 1启用',
    private String createBy;// '创建人',
    private Date createDate;// '创建时间',
    private String lastUpdateBy;// '最后更新人',
    private Date lastUpdateDate; // '最后更新时间',

    @HrmsId
    @HrmsGeneratedValue(strategy= HrmsGenerationType.UUID)
    public String getOrgCombineShopId() {
        return orgCombineShopId;
    }

    public void setOrgCombineShopId(String orgCombineShopId) {
        this.orgCombineShopId = orgCombineShopId;
    }

    public String getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
