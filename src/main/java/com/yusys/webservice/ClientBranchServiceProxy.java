package com.yusys.webservice;

public class ClientBranchServiceProxy implements com.yusys.webservice.ClientBranchService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientBranchService clientBranchService = null;
  
  public ClientBranchServiceProxy() {
    _initClientBranchServiceProxy();
  }
  
  public ClientBranchServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientBranchServiceProxy();
  }
  
  private void _initClientBranchServiceProxy() {
    try {
      clientBranchService = (new com.yusys.webservice.impl.ClientBranchServiceImplServiceLocator()).getClientBranchServiceImplPort();
      if (clientBranchService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientBranchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientBranchService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientBranchService != null)
      ((javax.xml.rpc.Stub)clientBranchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientBranchService getClientBranchService() {
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService;
  }
  
  public java.lang.String queryTagNames(java.lang.String sys_flag, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.queryTagNames(sys_flag, token_key);
  }
  
  public java.lang.String findBranch(java.lang.String repo_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.findBranch(repo_id, token_key);
  }
  
  public java.lang.String addBranch(java.lang.String userid, java.lang.String repoid, java.lang.String type, java.lang.String branchName, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.addBranch(userid, repoid, type, branchName, token_key);
  }
  
  public java.lang.String deleteBranch(java.lang.String userid, java.lang.String branchId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.deleteBranch(userid, branchId, token_key);
  }
  
  public java.lang.String addBranchByBranch(java.lang.String userid, java.lang.String repoid, java.lang.String type, java.lang.String branchName, java.lang.String byBranchId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.addBranchByBranch(userid, repoid, type, branchName, byBranchId, token_key);
  }
  
  public java.lang.String updateBranchIsDevelopState(java.lang.String user_id, java.lang.String branch_name, java.lang.String repoid, java.lang.String state, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientBranchService == null)
      _initClientBranchServiceProxy();
    return clientBranchService.updateBranchIsDevelopState(user_id, branch_name, repoid, state, token_key);
  }
  
  
}