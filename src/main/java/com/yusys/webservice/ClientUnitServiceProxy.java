package com.yusys.webservice;

public class ClientUnitServiceProxy implements com.yusys.webservice.ClientUnitService {
  private String _endpoint = null;
  private com.yusys.webservice.ClientUnitService clientUnitService = null;
  
  public ClientUnitServiceProxy() {
    _initClientUnitServiceProxy();
  }
  
  public ClientUnitServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientUnitServiceProxy();
  }
  
  private void _initClientUnitServiceProxy() {
    try {
      clientUnitService = (new com.yusys.webservice.impl.ClientUnitServiceImplServiceLocator()).getClientUnitServiceImplPort();
      if (clientUnitService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientUnitService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientUnitService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientUnitService != null)
      ((javax.xml.rpc.Stub)clientUnitService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yusys.webservice.ClientUnitService getClientUnitService() {
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService;
  }
  
  public java.lang.String findUnitById(java.lang.String unitID, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService.findUnitById(unitID, token_key);
  }
  
  public java.lang.String deleteUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService.deleteUnit(unitJson, token_key);
  }
  
  public java.lang.String updateUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService.updateUnit(unitJson, token_key);
  }
  
  public java.lang.String findUnitPage(java.lang.String unitJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService.findUnitPage(unitJson, limit, offset, token_key);
  }
  
  public java.lang.String insertUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException{
    if (clientUnitService == null)
      _initClientUnitServiceProxy();
    return clientUnitService.insertUnit(unitJson, token_key);
  }
  
  
}