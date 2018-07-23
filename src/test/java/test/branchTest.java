package test;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.yusys.webservice.impl.ClientBranchServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientBranchServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientChangeRecordServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientChangeRecordServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator;
import com.yusys.webservice.impl.ClientTaskServiceImplPortBindingStub;
import com.yusys.webservice.impl.ClientTaskServiceImplServiceLocator;

import entity.LoginInfo;

public class branchTest {
	private LoginInfo admin;
	@Before
	public void before() throws Exception {
		ClientLoginServiceImplServiceLocator service = new ClientLoginServiceImplServiceLocator();
		ClientLoginServiceImplPortBindingStub stub = (ClientLoginServiceImplPortBindingStub) service.getClientLoginServiceImplPort();
		String loginStr = stub.clientLogin("admin", "1","login_state01");
		String jsonStr = loginStr.substring(loginStr.indexOf("{"));
		admin = JSONObject.parseObject(jsonStr, LoginInfo.class);
	}
	@Test
	public void test() throws Exception {
		String uid = admin.getUid();
		String sysName = "CCAM";
		ClientTaskServiceImplServiceLocator taskService = new ClientTaskServiceImplServiceLocator();
		ClientTaskServiceImplPortBindingStub stub = (ClientTaskServiceImplPortBindingStub) taskService.getClientTaskServiceImplPort();
		String taskInfoStr = stub.findMyTaskInfo(uid, sysName, 0, 0, admin.getToken_key());
		System.out.println(taskInfoStr);
	}
	@Test
	public void branchtest() throws Exception {
		String repoId = "f2666f7b679242f5abe549a28bcc542a";
		ClientBranchServiceImplServiceLocator branchService = new ClientBranchServiceImplServiceLocator();
		ClientBranchServiceImplPortBindingStub branchStub = (ClientBranchServiceImplPortBindingStub) branchService.getClientBranchServiceImplPort();
		String branchListStr = branchStub.findBranch(repoId, admin.getToken_key());
		System.out.println(branchListStr);
	}
	@Test
	public void changeRecordtest() throws Exception {
		ClientChangeRecordServiceImplServiceLocator changeRecordService = new ClientChangeRecordServiceImplServiceLocator();
		ClientChangeRecordServiceImplPortBindingStub changeRecordStub = null;
		changeRecordStub = (ClientChangeRecordServiceImplPortBindingStub) changeRecordService
				.getClientChangeRecordServiceImplPort();
		String s = changeRecordStub.addChangeDataRecord("ddd", "0", "59f612a0e64f946889c347ac498acc4eaf1d5fe8","024cb7c60f2e40349843a1235c059086", 
				"675e06a380ab489f99431fca7c47f9c7be04d4306fae4a309de5bf30817a63e8", "2", "LoginInfo [git_pwd=77c420a4dd1c4713803a5d1cdd6d2912, git_pwd_md5=$apr1$zm0Ujz5M$RYVOr.IegSj9.bsMOceWf/, id=82034d3154df4b4d869ad20b4fe89305, login_name=admin, opt_person=2, opt_time=2018-03-16 21:22:34, state=00, svn_pwd=0430551ab3454268b9a21d1a230a1eb1, svn_pwd_md5=$apr1$KGP4aiht$i.zIuo1oLM1qa2/l8GRQw., token_key=ZacRENQcLTQsBF7x7lpHqA==, uid=0, person=Person [state_name=启用, name=admin, usertype=非行员, id=0, gender_id=1, unit_id=101, username=admin, deptname=null]]",admin.getToken_key());
		System.out.println(s);
	}

}
