package entity;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 部门实体类
 * @author 段钧丰
 */
public class CmUnitInfo implements Serializable{
	private static final long serialVersionUID = 5441298394719097665L;
	private Integer id;
	private Integer parentId;		//父单位id
	private String parentName;		//父单位名称
	private String type;			//部门类型编码
	private String typeName;		//部门类型名称	
	private String name;			//部门名称
	private String code;			//部门编号
	private String address;			//部门地址
	private String phone;			//部门电话

	@JSONField (format="yyyy-MM-dd HH:mm:ss")
	private Date createDate;		//创建时间
	private String comm;			//备注
	private Integer ord;			//序号
	private Integer isDeleted;		//是否删除
	private Integer deletePersonId;	//删除人ID
	private String deletePersonName;//删除人姓名
	private String deleteIp;		//删除IP

	@JSONField (format="yyyy-MM-dd HH:mm:ss") 
	private Date deleteDate;		//删除时间
	private String deleteReason;	//删除原因
	private String categoryId;		//机构类型编码
	private String categoryName;	//机构类型名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public Integer getOrd() {
		return ord;
	}
	public void setOrd(Integer ord) {
		this.ord = ord;
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
	public String getCategoryId() {
		return categoryId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getDeletePersonName() {
		return deletePersonName;
	}
	public void setDeletePersonName(String deletePersonName) {
		this.deletePersonName = deletePersonName;
	}
	@Override
	public String toString() {
		return "CmUnitInfo [id=" + id + ", parentId=" + parentId + ", parentName=" + parentName + ", type=" + type
				+ ", typeName=" + typeName + ", name=" + name + ", code=" + code + ", address=" + address + ", phone="
				+ phone + ", createDate=" + createDate + ", comm=" + comm + ", ord=" + ord + ", isDeleted=" + isDeleted
				+ ", deletePersonId=" + deletePersonId + ", deletePersonName=" + deletePersonName + ", deleteIp="
				+ deleteIp + ", deleteDate=" + deleteDate + ", deleteReason=" + deleteReason + ", categoryId="
				+ categoryId + ", categoryName=" + categoryName + "]";
	}
	
}