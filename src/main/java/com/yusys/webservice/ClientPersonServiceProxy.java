package com.yusys.webservice;

public class ClientPersonServiceProxy implements com.yusys.webservice.ClientPersonService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientPersonService clientPersonService = null;
  
  public ClientPersonServiceProxy() {
    _initClientPersonServiceProxy();
  }
  
  public ClientPersonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientPersonServiceProxy();
  }
  
  private void _initClientPersonServiceProxy() {
    try {
      clientPersonService = (new com.yusys.webservice.impl.ClientPersonServiceImplServiceLocator()).getClientPersonServiceImplPort();
      if (clientPersonService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientPersonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientPersonService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientPersonService != null)
      ((javax.xml.rpc.Stub)clientPersonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientPersonService getClientPersonService() {
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService;
  }
  
  public java.lang.String findSyncPerson(java.lang.String startDate) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findSyncPerson(startDate);
  }
  
  public java.lang.String findPersonByRole(java.lang.String r_id, int limit, int offset) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findPersonByRole(r_id, limit, offset);
  }
  
  public java.lang.String findPerson(java.lang.String unit_name, java.lang.String p_name, java.lang.String login_name, java.lang.String state, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findPerson(unit_name, p_name, login_name, state, limit, offset, token_key);
  }
  
  public java.lang.String addPersonRole(java.lang.String userid, java.lang.String p_id, java.lang.String r_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.addPersonRole(userid, p_id, r_id, token_key);
  }
  
  public java.lang.String updatePerson(java.lang.String userJson, java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.updatePerson(userJson, personJson, token_key);
  }
  
  public java.lang.String findCmPersonType() throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findCmPersonType();
  }
  
  public java.lang.String findPersonRole(java.lang.String p_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findPersonRole(p_id, token_key);
  }
  
  public java.lang.String insertPerson(java.lang.String userJson, java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.insertPerson(userJson, personJson, token_key);
  }
  
  public java.lang.String updateRoleByPid(java.lang.String p_id, java.lang.String role_type, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.updateRoleByPid(p_id, role_type, token_key);
  }
  
  public java.lang.String deletePerson(java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.deletePerson(personJson, token_key);
  }
  
  public java.lang.String addPersonRoleBatch(java.lang.String userid, boolean isMoreUser, java.lang.String userRoles, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.addPersonRoleBatch(userid, isMoreUser, userRoles, token_key);
  }
  
  public java.lang.String findCMUserRoleBySet(java.lang.String p_id, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.findCMUserRoleBySet(p_id, token_key);
  }
  
  public java.lang.String modifyPersonStateBatch(java.lang.String userid, java.lang.String plist, java.lang.String state, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientPersonService == null)
      _initClientPersonServiceProxy();
    return clientPersonService.modifyPersonStateBatch(userid, plist, state, token_key);
  }
  
  
}