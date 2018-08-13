package com.kealliang.org.entity;

import com.meicloud.sahara.orm.annotation.*;
import com.meicloud.sahara.orm.entity.Auditable;

import java.util.Date;

/**
 * <pre>
 * 表合并-小店(t_org_combine_store)实体类
 * </pre>
 * @author ren.liao@meicloud.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@HrmsEntity
@HrmsTable(name="t_org_combine_store")
public class OrgCombineStore implements Auditable {
     private String orgCombineStoreId; // '主键id',
     private String orgCombineShopId; // '关联合并门店主键id',
     private String orgUnitId; // '小店id',
     private String groupNo; //'组别',
     private String createBy; //'创建人',
     private Date createDate; // '创建时间',
     private String lastUpdateBy; //'最后更新人',
     private Date lastUpdateDate; // '最后更新时间',
     @HrmsId
     @HrmsGeneratedValue(strategy= HrmsGenerationType.UUID)
     public String getOrgCombineStoreId() {
          return orgCombineStoreId;
     }

     public String getOrgUnitId() {
          return orgUnitId;
     }

     public void setOrgUnitId(String orgUnitId) {
          this.orgUnitId = orgUnitId;
     }

     public void setOrgCombineStoreId(String orgCombineStoreId) {
          this.orgCombineStoreId = orgCombineStoreId;
     }

     public String getOrgCombineShopId() {
          return orgCombineShopId;
     }

     public void setOrgCombineShopId(String orgCombineShopId) {
          this.orgCombineShopId = orgCombineShopId;
     }

     public String getGroupNo() {
          return groupNo;
     }

     public void setGroupNo(String groupNo) {
          this.groupNo = groupNo;
     }

     public String getCreateBy() {
          return createBy;
     }

     public void setCreateBy(String createBy) {
          this.createBy = createBy;
     }


     public String getLastUpdateBy() {
          return lastUpdateBy;
     }

     public void setLastUpdateBy(String lastUpdateBy) {
          this.lastUpdateBy = lastUpdateBy;
     }


     public Date getCreateDate() {
          return createDate;
     }

     public void setCreateDate(Date createDate) {
          this.createDate = createDate;
     }

     public Date getLastUpdateDate() {
          return lastUpdateDate;
     }

     public void setLastUpdateDate(Date lastUpdateDate) {
          this.lastUpdateDate = lastUpdateDate;
     }
}