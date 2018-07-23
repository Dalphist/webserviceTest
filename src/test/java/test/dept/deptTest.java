package test.dept;


import java.rmi.RemoteException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientUnitServiceImplServiceLocator;

import entity.CmUnitInfo;
import entity.LoginInfo;
import util.DateUtil;

public class deptTest {
	
	private LoginInfo admin;
	private String token;
	CmUnitInfo unit;
	ClientUnitServiceImplPortBindingStub stub = null;
	@Before
	public void before() throws Exception {
		unit = new CmUnitInfo();
		ClientLoginServiceImplServiceLocator service = new ClientLoginServiceImplServiceLocator();
		ClientLoginServiceImplPortBindingStub s = (ClientLoginServiceImplPortBindingStub) service.getClientLoginServiceImplPort();
		String loginStr = s.clientLogin("admin", "1","login_state01");
		String jsonStr = loginStr.substring(loginStr.indexOf("{"));
		admin = JSONObject.parseObject(jsonStr, LoginInfo.class);
		token = admin.getToken_key();
		ClientUnitServiceImplServiceLocator locator = new ClientUnitServiceImplServiceLocator();
		stub = (ClientUnitServiceImplPortBindingStub) locator.getClientUnitServiceImplPort();
	}
	
	@Test
	public void findAllDeptTest() throws Exception {
		String deptStr = JSONObject.toJSONString(unit);
		String s = stub.findUnitPage(deptStr, 5, 5, token);
		JSONObject obj = JSONObject.parseObject(s);
		String total = obj.getString("total");
		String listStr = obj.getString("lsmap");
		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
		System.out.println(deptList.size());
//		assertEquals(4,deptList.size());
	}
	
	@Test
	public void findDeptBy() throws Exception {
		String s = stub.findUnitById("1010170616", token);
		CmUnitInfo unit = JSON.parseObject(s, CmUnitInfo.class);
		System.out.println(unit);
	}
	
	@Test
	public void findDeptBySthTest() throws Exception {
		unit.setName("中心");
		String deptStr = JSONObject.toJSONString(unit);
		String s = stub.findUnitPage(deptStr, 100, 0, token);
		JSONObject obj = JSONObject.parseObject(s);
		String total = obj.getString("total");
		String listStr = obj.getString("lsmap");
		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
		System.out.println(deptList.size());
//		assertEquals(2,deptList.size());
	}
	@Test
	public void findDeptByManyTest() throws Exception {
		unit.setName("中心");
		unit.setAddress("哈哈");
		unit.setCode("101");
		unit.setPhone("13");
		unit.setComm("嗷嗷");
		unit.setType("01");
		unit.setCategoryId("03");
		String deptStr = JSONObject.toJSONString(unit);
		String s = stub.findUnitPage(deptStr, 100, 0, token);
		JSONObject obj = JSONObject.parseObject(s);
		String total = obj.getString("total");
		String listStr = obj.getString("lsmap");
		List<CmUnitInfo> deptList = JSON.parseArray(listStr, CmUnitInfo.class);
		System.out.println(deptList.size());
//		assertEquals(1,deptList.size());
	}
	
	@Test
	public void insertUnitTest() throws RemoteException {
		unit.setName("测试部门1");
		unit.setAddress("地址1");
		unit.setCode("1111");
		unit.setPhone("30303030");
		unit.setComm("备注");
		unit.setType("01");
		unit.setCategoryId("03");
		unit.setParentId(2);
		unit.setCreateDate(DateUtil.getDate());
		String unitStr = JSONObject.toJSONString(unit);
		String s = stub.insertUnit(unitStr, token);
		System.out.println(s);
	}
	
	@Test
	public void updateUnitTest() throws RemoteException {
		unit.setId(1010170612);
		unit.setName("测试部门2");
		unit.setAddress("地址2");
		unit.setCode("2222");
		unit.setPhone("31313131");
		unit.setComm("备注2");
		unit.setType("02");
		unit.setCategoryId("04");
		unit.setParentId(3);
		String unitStr = JSONObject.toJSONString(unit);
		String s = stub.updateUnit(unitStr, token);
		System.out.println(s);
	}
	
	@Test
	public void deleteUnitTest() throws RemoteException {
		unit.setId(1010170612);
		unit.setDeletePersonId(33);
		unit.setDeleteIp("192.155");
		unit.setDeleteReason("原因");
		String unitStr = JSONObject.toJSONString(unit);
		String s = stub.deleteUnit(unitStr, token);
		System.out.println(s);
	}
	
	
	
	
}
