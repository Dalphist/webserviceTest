/**
 * ClientUnitServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice.impl;

public class ClientUnitServiceImplServiceLocator extends org.apache.axis.client.Service implements com.yusys.webservice.impl.ClientUnitServiceImplService {

    public ClientUnitServiceImplServiceLocator() {
    }


    public ClientUnitServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientUnitServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClientUnitServiceImplPort
    private java.lang.String ClientUnitServiceImplPort_address = "http://localhost:8080/scmtServer/client/clientUnit";

    public java.lang.String getClientUnitServiceImplPortAddress() {
        return ClientUnitServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClientUnitServiceImplPortWSDDServiceName = "ClientUnitServiceImplPort";

    public java.lang.String getClientUnitServiceImplPortWSDDServiceName() {
        return ClientUnitServiceImplPortWSDDServiceName;
    }

    public void setClientUnitServiceImplPortWSDDServiceName(java.lang.String name) {
        ClientUnitServiceImplPortWSDDServiceName = name;
    }

    public com.yusys.webservice.ClientUnitService getClientUnitServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClientUnitServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClientUnitServiceImplPort(endpoint);
    }

    public com.yusys.webservice.ClientUnitService getClientUnitServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub _stub = new com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getClientUnitServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClientUnitServiceImplPortEndpointAddress(java.lang.String address) {
        ClientUnitServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.yusys.webservice.ClientUnitService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub _stub = new com.yusys.webservice.impl.ClientUnitServiceImplPortBindingStub(new java.net.URL(ClientUnitServiceImplPort_address), this);
                _stub.setPortName(getClientUnitServiceImplPortWSDDServiceName());
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
        if ("ClientUnitServiceImplPort".equals(inputPortName)) {
            return getClientUnitServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.webservice.yusys.com/", "ClientUnitServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.webservice.yusys.com/", "ClientUnitServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClientUnitServiceImplPort".equals(portName)) {
            setClientUnitServiceImplPortEndpointAddress(address);
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
