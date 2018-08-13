package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;

/**
 *
 * <pre>
 *  课组业务表
 * </pre>
 *
 * @author liaoren ren.liao@meicloud.com
 * @version 1.00.00
 * @date 2018/3/12
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_kz")
public class OrgKz {
    
    private String kzCode;          // '课组编码'
    private String kzName;          // '课组名称'
    private String kzRange;         // '段'
    private String createdBy;       // '创建人'
    private String createDate;      // '创建时间'
    private String lastUpdateBy;    // '最后更新人'
    private String lastUpdateDate;  // '最后更新时间'

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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
