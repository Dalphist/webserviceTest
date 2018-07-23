package entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * person封装类
 * @author 
 */
public class CmPersonInfo implements Serializable {
    private Integer id;
    private String genderId;		//性别 1男 2女
    private String genderName;		//性别 1男 2女
    private String level;			//职称等级
    private String speciality;		//专业（职称）
    private Integer unitId;			//单位ID
    private Integer unitName;		//单位名称
    private String name;			//人员姓名
    private String mobile;			//移动电话
    private String officePhone;		//办公电话
    private String homePhone;		//家庭电话
    private String officeAddress;	//办公地点
    private String homeAddress;		//家庭地址
    private String photoPath;		//照片路径
    private String comm;			//备注
    private Date createDate;		//创建时间
    private Integer ord;			//人员序号
    private String education;		//学历
    private String political;		//政治面貌
    private String email;			//电子邮件
    private String resume;			//履历(预留)
    private Integer isDeleted;
    private Integer deletePersonId;
    private String deletePersonName;
    private String deleteIp;
    private Date deleteDate;
    private String deleteReason;
    private Integer ministryjobtitleId;
    private String ministryjobtitleName;
    private Integer civilianjobtitleId;
    private String civilianjobtitleName;
    private String loginName;
    private String usertype;		//人员类型
    private String usertypeName;	//人员类型名称
    private String graduateSchool;	//毕业学校
    private byte[] biography;		//个人简历

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getDeletePersonId() {
        return deletePersonId;
    }

    public void setDeletePersonId(Integer deletePersonId) {
        this.deletePersonId = deletePersonId;
    }

    public String getDeleteIp() {
        return deleteIp;
    }

    public void setDeleteIp(String deleteIp) {
        this.deleteIp = deleteIp;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    public Integer getMinistryjobtitleId() {
        return ministryjobtitleId;
    }

    public void setMinistryjobtitleId(Integer ministryjobtitleId) {
        this.ministryjobtitleId = ministryjobtitleId;
    }

    public Integer getCivilianjobtitleId() {
        return civilianjobtitleId;
    }

    public void setCivilianjobtitleId(Integer civilianjobtitleId) {
        this.civilianjobtitleId = civilianjobtitleId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public byte[] getBiography() {
        return biography;
    }

    public void setBiography(byte[] biography) {
        this.biography = biography;
    }
    public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public Integer getUnitName() {
		return unitName;
	}

	public void setUnitName(Integer unitName) {
		this.unitName = unitName;
	}

	public String getDeletePersonName() {
		return deletePersonName;
	}

	public void setDeletePersonName(String deletePersonName) {
		this.deletePersonName = deletePersonName;
	}

	public String getMinistryjobtitleName() {
		return ministryjobtitleName;
	}

	public void setMinistryjobtitleName(String ministryjobtitleName) {
		this.ministryjobtitleName = ministryjobtitleName;
	}

	public String getCivilianjobtitleName() {
		return civilianjobtitleName;
	}

	public void setCivilianjobtitleName(String civilianjobtitleName) {
		this.civilianjobtitleName = civilianjobtitleName;
	}

	public String getUsertypeName() {
		return usertypeName;
	}

	public void setUsertypeName(String usertypeName) {
		this.usertypeName = usertypeName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
        CmPersonInfo other = (CmPersonInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGenderId() == null ? other.getGenderId() == null : this.getGenderId().equals(other.getGenderId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getSpeciality() == null ? other.getSpeciality() == null : this.getSpeciality().equals(other.getSpeciality()))
            && (this.getUnitId() == null ? other.getUnitId() == null : this.getUnitId().equals(other.getUnitId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getOfficePhone() == null ? other.getOfficePhone() == null : this.getOfficePhone().equals(other.getOfficePhone()))
            && (this.getHomePhone() == null ? other.getHomePhone() == null : this.getHomePhone().equals(other.getHomePhone()))
            && (this.getOfficeAddress() == null ? other.getOfficeAddress() == null : this.getOfficeAddress().equals(other.getOfficeAddress()))
            && (this.getHomeAddress() == null ? other.getHomeAddress() == null : this.getHomeAddress().equals(other.getHomeAddress()))
            && (this.getPhotoPath() == null ? other.getPhotoPath() == null : this.getPhotoPath().equals(other.getPhotoPath()))
            && (this.getComm() == null ? other.getComm() == null : this.getComm().equals(other.getComm()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getOrd() == null ? other.getOrd() == null : this.getOrd().equals(other.getOrd()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getPolitical() == null ? other.getPolitical() == null : this.getPolitical().equals(other.getPolitical()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getResume() == null ? other.getResume() == null : this.getResume().equals(other.getResume()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getDeletePersonId() == null ? other.getDeletePersonId() == null : this.getDeletePersonId().equals(other.getDeletePersonId()))
            && (this.getDeleteIp() == null ? other.getDeleteIp() == null : this.getDeleteIp().equals(other.getDeleteIp()))
            && (this.getDeleteDate() == null ? other.getDeleteDate() == null : this.getDeleteDate().equals(other.getDeleteDate()))
            && (this.getDeleteReason() == null ? other.getDeleteReason() == null : this.getDeleteReason().equals(other.getDeleteReason()))
            && (this.getMinistryjobtitleId() == null ? other.getMinistryjobtitleId() == null : this.getMinistryjobtitleId().equals(other.getMinistryjobtitleId()))
            && (this.getCivilianjobtitleId() == null ? other.getCivilianjobtitleId() == null : this.getCivilianjobtitleId().equals(other.getCivilianjobtitleId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getGraduateSchool() == null ? other.getGraduateSchool() == null : this.getGraduateSchool().equals(other.getGraduateSchool()))
            && (Arrays.equals(this.getBiography(), other.getBiography()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGenderId() == null) ? 0 : getGenderId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getSpeciality() == null) ? 0 : getSpeciality().hashCode());
        result = prime * result + ((getUnitId() == null) ? 0 : getUnitId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getOfficePhone() == null) ? 0 : getOfficePhone().hashCode());
        result = prime * result + ((getHomePhone() == null) ? 0 : getHomePhone().hashCode());
        result = prime * result + ((getOfficeAddress() == null) ? 0 : getOfficeAddress().hashCode());
        result = prime * result + ((getHomeAddress() == null) ? 0 : getHomeAddress().hashCode());
        result = prime * result + ((getPhotoPath() == null) ? 0 : getPhotoPath().hashCode());
        result = prime * result + ((getComm() == null) ? 0 : getComm().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getOrd() == null) ? 0 : getOrd().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getPolitical() == null) ? 0 : getPolitical().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getResume() == null) ? 0 : getResume().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getDeletePersonId() == null) ? 0 : getDeletePersonId().hashCode());
        result = prime * result + ((getDeleteIp() == null) ? 0 : getDeleteIp().hashCode());
        result = prime * result + ((getDeleteDate() == null) ? 0 : getDeleteDate().hashCode());
        result = prime * result + ((getDeleteReason() == null) ? 0 : getDeleteReason().hashCode());
        result = prime * result + ((getMinistryjobtitleId() == null) ? 0 : getMinistryjobtitleId().hashCode());
        result = prime * result + ((getCivilianjobtitleId() == null) ? 0 : getCivilianjobtitleId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getGraduateSchool() == null) ? 0 : getGraduateSchool().hashCode());
        result = prime * result + (Arrays.hashCode(getBiography()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", genderId=").append(genderId);
        sb.append(", level=").append(level);
        sb.append(", speciality=").append(speciality);
        sb.append(", unitId=").append(unitId);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", officeAddress=").append(officeAddress);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", photoPath=").append(photoPath);
        sb.append(", comm=").append(comm);
        sb.append(", createDate=").append(createDate);
        sb.append(", ord=").append(ord);
        sb.append(", education=").append(education);
        sb.append(", political=").append(political);
        sb.append(", email=").append(email);
        sb.append(", resume=").append(resume);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", deletePersonId=").append(deletePersonId);
        sb.append(", deleteIp=").append(deleteIp);
        sb.append(", deleteDate=").append(deleteDate);
        sb.append(", deleteReason=").append(deleteReason);
        sb.append(", ministryjobtitleId=").append(ministryjobtitleId);
        sb.append(", civilianjobtitleId=").append(civilianjobtitleId);
        sb.append(", loginName=").append(loginName);
        sb.append(", usertype=").append(usertype);
        sb.append(", graduateSchool=").append(graduateSchool);
        sb.append(", biography=").append(biography);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}