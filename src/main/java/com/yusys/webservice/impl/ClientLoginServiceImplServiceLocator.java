/**
 * ClientLoginServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice.impl;

public class ClientLoginServiceImplServiceLocator extends org.apache.axis.client.Service implements com.yusys.webservice.impl.ClientLoginServiceImplService {

    public ClientLoginServiceImplServiceLocator() {
    }


    public ClientLoginServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientLoginServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClientLoginServiceImplPort
    private java.lang.String ClientLoginServiceImplPort_address = "http://localhost:8080/scmtServer/client/login";

    public java.lang.String getClientLoginServiceImplPortAddress() {
        return ClientLoginServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClientLoginServiceImplPortWSDDServiceName = "ClientLoginServiceImplPort";

    public java.lang.String getClientLoginServiceImplPortWSDDServiceName() {
        return ClientLoginServiceImplPortWSDDServiceName;
    }

    public void setClientLoginServiceImplPortWSDDServiceName(java.lang.String name) {
        ClientLoginServiceImplPortWSDDServiceName = name;
    }

    public com.yusys.webservice.ClientLoginService getClientLoginServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClientLoginServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClientLoginServiceImplPort(endpoint);
    }

    public com.yusys.webservice.ClientLoginService getClientLoginServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub _stub = new com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getClientLoginServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClientLoginServiceImplPortEndpointAddress(java.lang.String address) {
        ClientLoginServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.yusys.webservice.ClientLoginService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub _stub = new com.yusys.webservice.impl.ClientLoginServiceImplPortBindingStub(new java.net.URL(ClientLoginServiceImplPort_address), this);
                _stub.setPortName(getClientLoginServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ClientLoginServiceImplPort".equals(inputPortName)) {
            return getClientLoginServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.webservice.yusys.com/", "ClientLoginServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.webservice.yusys.com/", "ClientLoginServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClientLoginServiceImplPort".equals(portName)) {
            setClientLoginServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
