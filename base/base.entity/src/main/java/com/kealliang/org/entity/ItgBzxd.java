package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;

import java.util.Date;

/**
 *
 * <pre>
 * 推送给Mdm的标准小店信息
 * </pre>
 *
 * @author liaoren ren.liao@meicloud.com
 * @version 1.00.00
 * @date 2018/1/23
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_itg_bzxd")
public class ItgBzxd {
    private String itgBzxdId; // '标准小店'
    private String bzxdCode; // '标准小店编码'
    private String bzxdName; // '标准小店名'
    private String businessType; // '业态'
    private Integer handleNum; // '处理次数'
    private String handleStatus; // '0:未处理，1：处理失败  2：处理成功'''
    private Date createDate; // '创建时间'
    private String createBy; // '创建人'

    @HrmsId
    @HrmsGeneratedValue(strategy= HrmsGenerationType.UUID)
    public String getItgBzxdId() {
        return itgBzxdId;
    }

    public void setItgBzxdId(String itgBzxdId) {
        this.itgBzxdId = itgBzxdId;
    }

    public String getBzxdCode() {
        return bzxdCode;
    }

    public void setBzxdCode(String bzxdCode) {
        this.bzxdCode = bzxdCode;
    }

    public String getBzxdName() {
        return bzxdName;
    }

    public void setBzxdName(String bzxdName) {
        this.bzxdName = bzxdName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Integer getHandleNum() {
        return handleNum;
    }

    public void setHandleNum(Integer handleNum) {
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
}
