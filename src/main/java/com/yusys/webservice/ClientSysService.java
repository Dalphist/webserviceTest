/**
 * ClientSysService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientSysService extends java.rmi.Remote {
    public java.lang.String findSysById(java.lang.String sysId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deleteSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findSysPage(java.lang.String sysJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String insertSys(java.lang.String sysJson, java.lang.String token_key) throws java.rmi.RemoteException;
}
