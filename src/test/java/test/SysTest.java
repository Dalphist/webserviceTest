package test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientSysServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientSysServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientUnitServiceImplServiceLocator;

import entity.CmSystemInfo;
import entity.CmUnitInfo;
import entity.LoginInfo;

public class SysTest {
	
	private LoginInfo admin;
	private String token;
	CmSystemInfo sys;
	ClientSysServiceImplPortBindingStub stub = null;
	@Before
	public void before() throws Exception {
		sys = new CmSystemInfo();
		ClientLoginServiceImplServiceLocator service = new ClientLoginServiceImplServiceLocator();
		ClientLoginServiceImplPortBindingStub s = (ClientLoginServiceImplPortBindingStub) service.getClientLoginServiceImplPort();
		String loginStr = s.clientLogin("admin", "1","login_state01");
		String jsonStr = loginStr.substring(loginStr.indexOf("{"));
		admin = JSONObject.parseObject(jsonStr, LoginInfo.class);
		token = admin.getToken_key();
		ClientSysServiceImplServiceLocator locator = new ClientSysServiceImplServiceLocator();
		stub = (ClientSysServiceImplPortBindingStub) locator.getClientSysServiceImplPort();
	}
	
	@Test
	public void findSysPageTest() throws Exception {
		String sysStr = JSONObject.toJSONString(sys);
		String s = stub.findSysPage(sysStr, 5, 5, token);
		JSONObject obj = JSONObject.parseObject(s);
		String total = obj.getString("total");
		String listStr = obj.getString("lsmap");
		List<CmSystemInfo> sysList = JSON.parseArray(listStr, CmSystemInfo.class);
		System.out.println(sysList.size());
	}
	
	@Test
	public void QuerySysPageTest() throws Exception {
		sys.setSysName("系统");
		String sysStr = JSONObject.toJSONString(sys);
		String s = stub.findSysPage(sysStr, 5, 0, token);
		JSONObject obj = JSONObject.parseObject(s);
		String total = obj.getString("total");
		String listStr = obj.getString("lsmap");
		List<CmSystemInfo> sysList = JSON.parseArray(listStr, CmSystemInfo.class);
		System.out.println(sysList.size());
	}
	
	@Test
	public void findSysByIdTest() throws Exception {
		String s = stub.findSysById("1", token);
		CmSystemInfo sys = JSONObject.parseObject(s,CmSystemInfo.class);
		System.out.println(sys.getSysName());
	}
	
	@Test
	public void insertSysTest() throws Exception {
		sys.setSysName("cccccdddd");
		String sysJson = JSON.toJSONString(sys);
		String s = stub.insertSys(sysJson, token);
		System.out.println(s);
	}
	

	@Test
	public void updateSysTest() throws Exception {
		sys.setSysId("SYS20180710001");
		sys.setSysName("OOOOOOO中心asdadasdads");
		sys.setCategoryId("3");
		sys.setParentId("2");
		String sysJson = JSON.toJSONString(sys);
		String s = stub.updateSys(sysJson, token);
		System.out.println(s);
	}
	
	@Test
	public void deleteSysTest() throws Exception {
		sys.setSysId("SYS20180710001");
		String sysJson = JSON.toJSONString(sys);
		String s = stub.deleteSys(sysJson, token);
		System.out.println(s);
	}
}
