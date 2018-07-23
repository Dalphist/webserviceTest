package com.yusys.webservice;

public class ClientChangeRecordServiceProxy implements com.yusys.webservice.ClientChangeRecordService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientChangeRecordService clientChangeRecordService = null;
  
  public ClientChangeRecordServiceProxy() {
    _initClientChangeRecordServiceProxy();
  }
  
  public ClientChangeRecordServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientChangeRecordServiceProxy();
  }
  
  private void _initClientChangeRecordServiceProxy() {
    try {
      clientChangeRecordService = (new com.yusys.webservice.impl.ClientChangeRecordServiceImplServiceLocator()).getClientChangeRecordServiceImplPort();
      if (clientChangeRecordService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientChangeRecordService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientChangeRecordService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientChangeRecordService != null)
      ((javax.xml.rpc.Stub)clientChangeRecordService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientChangeRecordService getClientChangeRecordService() {
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService;
  }
  
  public java.lang.String addChangeDataRecord(java.lang.String name, java.lang.String submit_id, java.lang.String thisChangeId, java.lang.String sys_id, java.lang.String branch_id, java.lang.String task_id, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.addChangeDataRecord(name, submit_id, thisChangeId, sys_id, branch_id, task_id, opt_person, token_key);
  }
  
  public java.lang.String updateChangeDataRecord(java.lang.String recordIds, java.lang.String branch_id, java.lang.String nextBranch_id, java.lang.String opt_person, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.updateChangeDataRecord(recordIds, branch_id, nextBranch_id, opt_person, develop_mode_name, token_key);
  }
  
  public java.lang.String addChangeDataFile(java.lang.String change_id, java.lang.String name, java.lang.String path, java.lang.String type, int insert_count, int delete_count, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.addChangeDataFile(change_id, name, path, type, insert_count, delete_count, opt_person, token_key);
  }
  
  public java.lang.String findMergeAddChangeDataFile(java.lang.String thisChangeId, java.lang.String nextChangeId, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findMergeAddChangeDataFile(thisChangeId, nextChangeId, opt_person, token_key);
  }
  
  public java.lang.String findChangeDataTagRecord(java.lang.String submitId, java.lang.String branchId, java.lang.String sys_id, java.lang.String tag_name, java.lang.String token_key, int limit, int offset) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataTagRecord(submitId, branchId, sys_id, tag_name, token_key, limit, offset);
  }
  
  public java.lang.String findChangeDataRecordTagBySysId(java.lang.String sys_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataRecordTagBySysId(sys_id, token_key);
  }
  
  public java.lang.String findBranchNameByBranchName(java.lang.String branch_name, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findBranchNameByBranchName(branch_name, token_key);
  }
  
  public java.lang.String deleteChangeDataTagRecord(java.lang.String tagIds, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.deleteChangeDataTagRecord(tagIds, opt_person, token_key);
  }
  
  public java.lang.String findSysFlagDevelopModeState(java.lang.String flag, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findSysFlagDevelopModeState(flag, token_key);
  }
  
  public java.lang.String findTaskIdByChangeId(java.lang.String changeId, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findTaskIdByChangeId(changeId, opt_person, token_key);
  }
  
  public java.lang.String findChangeDataTagRecordForBranch(java.lang.String submitId, java.lang.String branchId, java.lang.String sys_id, java.lang.String tag_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataTagRecordForBranch(submitId, branchId, sys_id, tag_name, limit, offset, token_key);
  }
  
  public java.lang.String findBranchNameByParentId(java.lang.String parent_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findBranchNameByParentId(parent_id, token_key);
  }
  
  public java.lang.String findDomainNameIp(java.lang.String infoFlag, java.lang.String userId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findDomainNameIp(infoFlag, userId, token_key);
  }
  
  public java.lang.String findChangeDataRecord(java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataRecord(branchId, nextBranch_id, person_name, task_name, change_name, develop_mode_name, token_key);
  }
  
  public java.lang.String findChangeDataRecordByPage(java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataRecordByPage(branchId, nextBranch_id, person_name, task_name, change_name, limit, offset, token_key);
  }
  
  public java.lang.String createChangeDataTagRecord(java.lang.String branch_id, java.lang.String tag_name, java.lang.String changeRecordIds, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.createChangeDataTagRecord(branch_id, tag_name, changeRecordIds, opt_person, token_key);
  }
  
  public java.lang.String findChangeDataByTagId(java.lang.String tag_id, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataByTagId(tag_id, limit, offset, token_key);
  }
  
  public java.lang.String findChangeDataRecordById(java.lang.String new_change_id, java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findChangeDataRecordById(new_change_id, branchId, nextBranch_id, person_name, task_name, change_name, develop_mode_name, token_key);
  }
  
  public java.lang.String findBranchStateByBranchName(java.lang.String branch_name, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientChangeRecordService == null)
      _initClientChangeRecordServiceProxy();
    return clientChangeRecordService.findBranchStateByBranchName(branch_name, token_key);
  }
  
  
}