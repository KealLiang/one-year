package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.HrmsEntity;
import com.meicloud.sahara.orm.annotation.HrmsId;
import com.meicloud.sahara.orm.annotation.HrmsTable;

import java.util.Date;

/**
 * <pre>
 * 门店主数据业务表-表(t_org_shop)实体类
 * </pre>
 *
 * @author liaoren ren.liao@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name = "t_org_shop")
public class OrgShop {
    private String code;        //  '门店编码'
    private String companyCode; //  '公司代码'
    private String purchaseOrg; //  '采购组织'
    private String regionCode;  //  '大区编号'
    private String name;        //  '门店名称'
    private Date businessDate;  //  '开业时间'
    private String province;    //  '省份'
    private String city;        //  '地级市'
    private String country;     //  '县级市'
    private String status;      //  '门店状态'
    private String address;     //  '门店地址'
    private String storeCategory; //  '门店类型'
    private String contractArea; //  '合约面积'
    private String realArea;    //  '实际总面积'
    private String totalArea;   //  '超市总面积'
    private String groupId;     //  '区域店群号'
    private String createdBy;   // 创建人
    private Date createDate;    // '创建时间'
    private String lastUpdateBy;// '最后更新人'
    private Date lastUpdateDate; // '最后更新时间'
    @HrmsId
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPurchaseOrg() {
        return purchaseOrg;
    }

    public void setPurchaseOrg(String purchaseOrg) {
        this.purchaseOrg = purchaseOrg;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    public String getContractArea() {
        return contractArea;
    }

    public void setContractArea(String contractArea) {
        this.contractArea = contractArea;
    }

    public String getRealArea() {
        return realArea;
    }

    public void setRealArea(String realArea) {
        this.realArea = realArea;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
