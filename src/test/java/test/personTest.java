package test;


import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientPersonServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientPersonServiceImplServiceLocator;

import entity.CMUserInfo;
import entity.CmPersonInfo;
import entity.LoginInfo;
import util.DateUtil;

public class personTest {
	
	private LoginInfo admin;
	private String token;
	CMUserInfo user;
	CmPersonInfo person;
	ClientPersonServiceImplPortBindingStub stub = null;
	@Before
	public void before() throws Exception {
		user = new CMUserInfo();
		person = new CmPersonInfo();
		ClientLoginServiceImplServiceLocator service = new ClientLoginServiceImplServiceLocator();
		ClientLoginServiceImplPortBindingStub s = (ClientLoginServiceImplPortBindingStub) service.getClientLoginServiceImplPort();
		String loginStr = s.clientLogin("admin", "1","login_state01");
		String jsonStr = loginStr.substring(loginStr.indexOf("{"));
		admin = JSONObject.parseObject(jsonStr, LoginInfo.class);
		token = admin.getToken_key();
		ClientPersonServiceImplServiceLocator locator = new ClientPersonServiceImplServiceLocator();
		stub = (ClientPersonServiceImplPortBindingStub) locator.getClientPersonServiceImplPort();
	}
	
//	@Test
//	public void findAllDeptTest() throws Exception {
//		String deptStr = JSONObject.toJSONString(unit);
//		String s = stub.findUnitPage(deptStr, 5, 0, token);
//		JSONObject obj = JSONObject.parseObject(s);
//		String total = obj.getString("total");
//		String listStr = obj.getString("lsmap");
//		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
//		System.out.println(deptList.size());
////		assertEquals(4,deptList.size());
//	}
	
//	@Test
//	public void findDeptBy() throws Exception {
//		String s = stub.findUnitById("1010170616", token);
//		CmUnitInfo unit = JSON.parseObject(s, CmUnitInfo.class);
//		System.out.println(unit);
//	}
//	
//	@Test
//	public void findDeptBySthTest() throws Exception {
//		unit.setName("中心");
//		String deptStr = JSONObject.toJSONString(unit);
//		String s = stub.findUnitPage(deptStr, 100, 0, token);
//		JSONObject obj = JSONObject.parseObject(s);
//		String total = obj.getString("total");
//		String listStr = obj.getString("lsmap");
//		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
//		System.out.println(deptList.size());
////		assertEquals(2,deptList.size());
//	}
//	
//	@Test
//	public void findDeptByManyTest() throws Exception {
//		unit.setName("中心");
//		unit.setAddress("哈哈");
//		unit.setCode("101");
//		unit.setPhone("13");
//		unit.setComm("嗷嗷");
//		unit.setType("01");
//		unit.setCategoryId("03");
//		String deptStr = JSONObject.toJSONString(unit);
//		String s = stub.findUnitPage(deptStr, 100, 0, token);
//		JSONObject obj = JSONObject.parseObject(s);
//		String total = obj.getString("total");
//		String listStr = obj.getString("lsmap");
//		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
//		System.out.println(deptList.size());
//	}
	
	@Test
	public void insertPersonTest() throws RemoteException {
		user.setUid("100");
		user.setType("PPPP");
		user.setState("ssss");
		user.setLoginName("djf");
		user.setLoginPwd("111");
		user.setGitPwd("222");
		user.setSvnPwd("333");
		user.setOptPerson("0");
		
		person.setName("duan");
		
		String userStr = JSONObject.toJSONString(user);
		String personStr = JSONObject.toJSONString(person);
		String s = stub.insertPerson(userStr,personStr,token);
		System.out.println(s);
	}
	
	@Test
	public void updatePersonTest() throws RemoteException {
		int uid = 300032;
		person.setId(uid);
		person.setName("jun");
		person.setUnitId(33);
		person.setComm("备注");
		person.setOfficePhone("133232323");
		
		user.setUid(String.valueOf(uid));
		user.setType("qqqq");
		user.setState("qqq");
		user.setLoginName("qqq");
		user.setLoginPwd("222");
		
		String userStr = JSONObject.toJSONString(user);
		String personStr = JSONObject.toJSONString(person);
		String s = stub.updatePerson(userStr,personStr,token);
		System.out.println(s);
	}
	
	@Test
	public void deletePersonTest() throws RemoteException {
		int uid = 300031;
		person.setId(uid);
		person.setDeletePersonId(0);
		
		String personStr = JSONObject.toJSONString(person);
		String s = stub.deletePerson(personStr,token);
		System.out.println(s);
	}
	
	
	
	
}
