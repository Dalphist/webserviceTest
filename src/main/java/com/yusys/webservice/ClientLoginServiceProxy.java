package com.yusys.webservice;

public class ClientLoginServiceProxy implements com.yusys.webservice.ClientLoginService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientLoginService clientLoginService = null;
  
  public ClientLoginServiceProxy() {
    _initClientLoginServiceProxy();
  }
  
  public ClientLoginServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientLoginServiceProxy();
  }
  
  private void _initClientLoginServiceProxy() {
    try {
      clientLoginService = (new com.yusys.webservice.impl.ClientLoginServiceImplServiceLocator()).getClientLoginServiceImplPort();
      if (clientLoginService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientLoginService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientLoginService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientLoginService != null)
      ((javax.xml.rpc.Stub)clientLoginService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientLoginService getClientLoginService() {
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService;
  }
  
  public java.lang.String login(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException{
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService.login(uname, pwd);
  }
  
  public java.lang.String deleteTokenKey(java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService.deleteTokenKey(token_key);
  }
  
  public java.lang.String configureLogin(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException{
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService.configureLogin(uname, pwd);
  }
  
  public java.lang.String clientLogin(java.lang.String uname, java.lang.String pwd, java.lang.String type) throws java.rmi.RemoteException{
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService.clientLogin(uname, pwd, type);
  }
  
  public java.lang.String findTokenKeyByToken(java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientLoginService == null)
      _initClientLoginServiceProxy();
    return clientLoginService.findTokenKeyByToken(token_key);
  }
  
  
}