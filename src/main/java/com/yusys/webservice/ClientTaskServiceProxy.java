package com.yusys.webservice;

public class ClientTaskServiceProxy implements com.yusys.webservice.ClientTaskService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientTaskService clientTaskService = null;
  
  public ClientTaskServiceProxy() {
    _initClientTaskServiceProxy();
  }
  
  public ClientTaskServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientTaskServiceProxy();
  }
  
  private void _initClientTaskServiceProxy() {
    try {
      clientTaskService = (new com.yusys.webservice.impl.ClientTaskServiceImplServiceLocator()).getClientTaskServiceImplPort();
      if (clientTaskService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientTaskService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientTaskService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientTaskService != null)
      ((javax.xml.rpc.Stub)clientTaskService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientTaskService getClientTaskService() {
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService;
  }
  
  public java.lang.String findMyTaskInfo(java.lang.String user_id, java.lang.String sys_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.findMyTaskInfo(user_id, sys_name, limit, offset, token_key);
  }
  
  public java.lang.String findTaskById(java.lang.String taskId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.findTaskById(taskId, token_key);
  }
  
  public java.lang.String deleteTask(java.lang.String taskId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.deleteTask(taskId, token_key);
  }
  
  public java.lang.String updateTask(java.lang.String taskJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.updateTask(taskJson, token_key);
  }
  
  public java.lang.String insertTask(java.lang.String taskJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.insertTask(taskJson, token_key);
  }
  
  public java.lang.String findTaskPage(java.lang.String taskJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientTaskService == null)
      _initClientTaskServiceProxy();
    return clientTaskService.findTaskPage(taskJson, limit, offset, token_key);
  }
  
  
}