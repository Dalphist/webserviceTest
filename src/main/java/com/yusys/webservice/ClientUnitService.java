/**
 * ClientUnitService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientUnitService extends java.rmi.Remote {
    public java.lang.String findUnitById(java.lang.String unitID, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deleteUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findUnitPage(java.lang.String unitJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String insertUnit(java.lang.String unitJson, java.lang.String token_key) throws java.rmi.RemoteException;
}
