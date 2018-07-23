package com.yusys.webservice;

public class ClientSysServiceProxy implements com.yusys.webservice.ClientSysService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientSysService clientSysService = null;
  
  public ClientSysServiceProxy() {
    _initClientSysServiceProxy();
  }
  
  public ClientSysServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientSysServiceProxy();
  }
  
  private void _initClientSysServiceProxy() {
    try {
      clientSysService = (new com.yusys.webservice.impl.ClientSysServiceImplServiceLocator()).getClientSysServiceImplPort();
      if (clientSysService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientSysService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientSysService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientSysService != null)
      ((javax.xml.rpc.Stub)clientSysService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientSysService getClientSysService() {
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService;
  }
  
  public java.lang.String findSysById(java.lang.String sysId, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService.findSysById(sysId, token_key);
  }
  
  public java.lang.String deleteSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService.deleteSys(sysJson, token_key);
  }
  
  public java.lang.String updateSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService.updateSys(sysJson, token_key);
  }
  
  public java.lang.String findSysPage(java.lang.String sysJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService.findSysPage(sysJson, limit, offset, token_key);
  }
  
  public java.lang.String insertSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientSysService == null)
      _initClientSysServiceProxy();
    return clientSysService.insertSys(sysJson, token_key);
  }
  
  
}