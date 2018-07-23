/**
 * ClientLoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientLoginService extends java.rmi.Remote {
    public java.lang.String login(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String deleteTokenKey(java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String configureLogin(java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String clientLogin(java.lang.String uname, java.lang.String pwd, java.lang.String type) throws java.rmi.RemoteException;
    public java.lang.String findTokenKeyByToken(java.lang.String token_key) throws java.rmi.RemoteException;
}
