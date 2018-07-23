package entity;

import java.io.Serializable;
import java.util.Date;

/**
 */
public class CmSystemInfo implements Serializable {
    private String uuid;
    private String sysName;			//系统名称
    private String sysId;			//系统编号
    private String sysShortcode;	//系统简码
    private String parentId;		//父节点ID
    private String parentName;		//父系统
    private Integer isDeleted;		//是否删除0:正常 1:删除
    private String statusId;		//系统状态ID
    private String statusName;		//系统状态
    private String categoryId;		//系统分类ID
    private String categoryName;	//系统分类名称
    private Integer userId;			//创建者ID
    private String userName;		//创建者姓名
    private Date createTime;		//创建时间
    private String createType;		//系统创建类型（预留：用于区分导入还是自建）
    private String createName;		//系统创建类型（预留：用于区分导入还是自建）
    private String deleteIp;
    private Integer deletePersonId;
    private String deletePersonName;
    private Date deleteDate;
    private Integer isAllPerson;		//是否所有人员可见1是0否
    private String businessUnit;		//业务主管部门
    private String safeLevelId;			//信息系统安全等级保护ID：等保1级...5
    private String safeLevelName;		//信息系统安全等级保护名称
    private String remark;				//备注
    private String ext1;
    private String ext2;
    private String ext3;
    private String sysDescription;		//系统介绍、简介

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSysShortcode() {
        return sysShortcode;
    }

    public void setSysShortcode(String sysShortcode) {
        this.sysShortcode = sysShortcode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getDeleteIp() {
        return deleteIp;
    }

    public void setDeleteIp(String deleteIp) {
        this.deleteIp = deleteIp;
    }

    public Integer getDeletePersonId() {
        return deletePersonId;
    }

    public void setDeletePersonId(Integer deletePersonId) {
        this.deletePersonId = deletePersonId;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Integer getIsAllPerson() {
        return isAllPerson;
    }

    public void setIsAllPerson(Integer isAllPerson) {
        this.isAllPerson = isAllPerson;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getSafeLevelId() {
        return safeLevelId;
    }

    public void setSafeLevelId(String safeLevelId) {
        this.safeLevelId = safeLevelId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getSysDescription() {
        return sysDescription;
    }

    public void setSysDescription(String sysDescription) {
        this.sysDescription = sysDescription;
    }
    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeletePersonName() {
		return deletePersonName;
	}

	public void setDeletePersonName(String deletePersonName) {
		this.deletePersonName = deletePersonName;
	}

	public String getSafeLevelName() {
		return safeLevelName;
	}

	public void setSafeLevelName(String safeLevelName) {
		this.safeLevelName = safeLevelName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CmSystemInfo other = (CmSystemInfo) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getSysShortcode() == null ? other.getSysShortcode() == null : this.getSysShortcode().equals(other.getSysShortcode()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getStatusName() == null ? other.getStatusName() == null : this.getStatusName().equals(other.getStatusName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateType() == null ? other.getCreateType() == null : this.getCreateType().equals(other.getCreateType()))
            && (this.getDeleteIp() == null ? other.getDeleteIp() == null : this.getDeleteIp().equals(other.getDeleteIp()))
            && (this.getDeletePersonId() == null ? other.getDeletePersonId() == null : this.getDeletePersonId().equals(other.getDeletePersonId()))
            && (this.getDeleteDate() == null ? other.getDeleteDate() == null : this.getDeleteDate().equals(other.getDeleteDate()))
            && (this.getIsAllPerson() == null ? other.getIsAllPerson() == null : this.getIsAllPerson().equals(other.getIsAllPerson()))
            && (this.getBusinessUnit() == null ? other.getBusinessUnit() == null : this.getBusinessUnit().equals(other.getBusinessUnit()))
            && (this.getSafeLevelId() == null ? other.getSafeLevelId() == null : this.getSafeLevelId().equals(other.getSafeLevelId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getExt1() == null ? other.getExt1() == null : this.getExt1().equals(other.getExt1()))
            && (this.getExt2() == null ? other.getExt2() == null : this.getExt2().equals(other.getExt2()))
            && (this.getExt3() == null ? other.getExt3() == null : this.getExt3().equals(other.getExt3()))
            && (this.getSysDescription() == null ? other.getSysDescription() == null : this.getSysDescription().equals(other.getSysDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getSysShortcode() == null) ? 0 : getSysShortcode().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateType() == null) ? 0 : getCreateType().hashCode());
        result = prime * result + ((getDeleteIp() == null) ? 0 : getDeleteIp().hashCode());
        result = prime * result + ((getDeletePersonId() == null) ? 0 : getDeletePersonId().hashCode());
        result = prime * result + ((getDeleteDate() == null) ? 0 : getDeleteDate().hashCode());
        result = prime * result + ((getIsAllPerson() == null) ? 0 : getIsAllPerson().hashCode());
        result = prime * result + ((getBusinessUnit() == null) ? 0 : getBusinessUnit().hashCode());
        result = prime * result + ((getSafeLevelId() == null) ? 0 : getSafeLevelId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getExt1() == null) ? 0 : getExt1().hashCode());
        result = prime * result + ((getExt2() == null) ? 0 : getExt2().hashCode());
        result = prime * result + ((getExt3() == null) ? 0 : getExt3().hashCode());
        result = prime * result + ((getSysDescription() == null) ? 0 : getSysDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", sysName=").append(sysName);
        sb.append(", sysId=").append(sysId);
        sb.append(", sysShortcode=").append(sysShortcode);
        sb.append(", parentId=").append(parentId);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", statusId=").append(statusId);
        sb.append(", statusName=").append(statusName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createType=").append(createType);
        sb.append(", deleteIp=").append(deleteIp);
        sb.append(", deletePersonId=").append(deletePersonId);
        sb.append(", deleteDate=").append(deleteDate);
        sb.append(", isAllPerson=").append(isAllPerson);
        sb.append(", businessUnit=").append(businessUnit);
        sb.append(", safeLevelId=").append(safeLevelId);
        sb.append(", remark=").append(remark);
        sb.append(", ext1=").append(ext1);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append(", sysDescription=").append(sysDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}