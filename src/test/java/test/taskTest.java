package test;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientTaskServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientTaskServiceImplServiceLocator;

import entity.CmTaskInfo;
import entity.LoginInfo;

public class taskTest {
	private LoginInfo admin;
	private String token;
	private ClientTaskServiceImplPortBindingStub stub = null;
	@Before
	public void before() throws Exception {
		ClientLoginServiceImplServiceLocator service = new ClientLoginServiceImplServiceLocator();
		ClientLoginServiceImplPortBindingStub s = (ClientLoginServiceImplPortBindingStub) service.getClientLoginServiceImplPort();
		String loginStr = s.clientLogin("admin", "1","login_state01");
		String jsonStr = loginStr.substring(loginStr.indexOf("{"));
		admin = JSONObject.parseObject(jsonStr, LoginInfo.class);
		token = admin.getToken_key();
		ClientTaskServiceImplServiceLocator taskService = new ClientTaskServiceImplServiceLocator();
		stub = (ClientTaskServiceImplPortBindingStub) taskService.getClientTaskServiceImplPort();
	}
	@Test
	public void findMyTasktest() throws Exception {
		String uid = admin.getUid();
		String sysName = "PWAP";
		String taskInfoStr = stub.findMyTaskInfo(uid, sysName, 0, 0, token);
		System.out.println(taskInfoStr);
	}
	
	@Test
	public void findPagetest() throws Exception {
		CmTaskInfo task = new CmTaskInfo();
		task.setName("当前");
		task.setProjectId("PWAP");
		task.setUid("872");
		task.setUserName("");
		task.setPriority(1);
		task.setCategory(1);
		task.setStatus(1);
		String taskJson = JSONObject.toJSONString(task);
		String taskInfoStr = stub.findTaskPage(taskJson, 10, 0, token);
		System.out.println(taskInfoStr);
	}
	
	@Test
	public void findTaskByIdtest() throws Exception {
		String taskInfoStr = stub.findTaskById("001f53555ddc4dd7b034fafada02d84c", token);
		System.out.println(taskInfoStr);
	}
	
	@Test
	public void insertTaskTest() throws Exception {
		CmTaskInfo task = new CmTaskInfo();
		task.setName("测试任务1");
		task.setProjectId("PWAP");
		task.setUid("666");
		task.setUserName("");
		task.setPriority(1);
		task.setCategory(1);
		task.setStatus(1);
		String taskJson = JSONObject.toJSONString(task);
		String count = stub.insertTask(taskJson, token);
		System.out.println(count);
	}
	
	@Test
	public void updateTaskTest() throws Exception {
		CmTaskInfo task = new CmTaskInfo();
		task.setId("63527870cb5247bab5ef016c2b9cc8dc");
		task.setName("测试任务2");
		task.setProjectId("PWAP2");
		task.setUid("6662");
		task.setPriority(2);
		task.setCategory(2);
		task.setStatus(2);
		String taskJson = JSONObject.toJSONString(task);
		String count = stub.updateTask(taskJson, token);
		System.out.println(count);
	}
	
	@Test
	public void deleteTaskTest() throws Exception {
		String count = stub.deleteTask("63527870cb5247bab5ef016c2b9cc8dc", token);
		System.out.println(count);
	}
}
