package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;

import java.util.Date;

/**
 *
 * <pre>
 *  课组标准小店业务表
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
@HrmsTable(name="t_org_kz_bzxd")
public class OrgKzBzxd {
    
    private String itgKzBzxdId;      // '课组小店表主键'
    private String kzCode;           // '课组编码'
    private String kzName;           // '课组名称'
    private String kzRange;          // '段'
    private String bzxdCode;         // '标准小店编码'
    private String createBy;         // '创建人'
    private Date createDate;         // '创建时间'
    private String lastUpdateBy;     // '最后更新人'
    private Date lastUpdateDate;     // '最后更新时间'
    private String clusterFlag;      // '集群标记 1:一集群 2:二集群'

    @HrmsId
    @HrmsGeneratedValue(strategy= HrmsGenerationType.UUID)
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

    public String getClusterFlag() {
        return clusterFlag;
    }

    public void setClusterFlag(String clusterFlag) {
        this.clusterFlag = clusterFlag;
    }
}
