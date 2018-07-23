package entity;

import java.io.Serializable;
import java.util.Date;

import util.MD5Crypt;

/**
 * User封装类
 */
public class CMUserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String uid;	
	private String state;			//状态：00启用01停用
	private String stateName;		//状态名称
	private String loginName;
	private String loginPwd;
	private String loginPwdMd5;
	private String gitPwd;
	private String gitPwdMd5;
	private String svnPwd;
	private String svnPwdMd5;
	private String optPerson;		//操作人id
	private String optPersonName;	//操作人姓名
	private Date optTime;
	private String tokenKey;
	private String type; 			//人员类型
	private String typeName; 		//人员类型名称
	private String free1;
	private String free2;
	private String free3;
	private String free4;
	private String free5;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFree1() {
		return free1;
	}
	public void setFree1(String free1) {
		this.free1 = free1;
	}
	public String getFree2() {
		return free2;
	}
	public void setFree2(String free2) {
		this.free2 = free2;
	}
	public String getFree3() {
		return free3;
	}
	public void setFree3(String free3) {
		this.free3 = free3;
	}
	public String getFree4() {
		return free4;
	}
	public void setFree4(String free4) {
		this.free4 = free4;
	}
	public String getFree5() {
		return free5;
	}
	public void setFree5(String free5) {
		this.free5 = free5;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGitPwd() {
		return gitPwd;
	}
	public void setGitPwd(String git_pwd) {
		this.gitPwd = git_pwd;
		try {//设置明文密码和apacheMd5密码
			this.gitPwdMd5=MD5Crypt.encrypt(git_pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getSvnPwd() {
		return svnPwd;
	}
	public void setSvnPwd(String svn_pwd) {
		this.svnPwd = svn_pwd;
		try {//设置明文密码和apacheMd5密码
			this.svnPwdMd5=MD5Crypt.encrypt(svn_pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
		try {//设置明文密码和apacheMd5密码
			this.loginPwdMd5=MD5Crypt.encrypt(loginPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getLoginPwdMd5() {
		return loginPwdMd5;
	}
	public void setLoginPwdMd5(String loginPwdMd5) {
		this.loginPwdMd5 = loginPwdMd5;
	}
	public String getGitPwdMd5() {
		return gitPwdMd5;
	}
	public void setGitPwdMd5(String gitPwdMd5) {
		this.gitPwdMd5 = gitPwdMd5;
	}
	public String getSvnPwdMd5() {
		return svnPwdMd5;
	}
	public void setSvnPwdMd5(String svnPwdMd5) {
		this.svnPwdMd5 = svnPwdMd5;
	}
	public String getOptPerson() {
		return optPerson;
	}
	public void setOptPerson(String optPerson) {
		this.optPerson = optPerson;
	}
	public String getTokenKey() {
		return tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}
	public String getOptPersonName() {
		return optPersonName;
	}
	public void setOptPersonName(String optPersonName) {
		this.optPersonName = optPersonName;
	}
	public Date getOptTime() {
		return optTime;
	}
	public void setOptTime(Date optTime) {
		this.optTime = optTime;
	}	
	
}
