/**
 * ClientPersonService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientPersonService extends java.rmi.Remote {
    public java.lang.String findSyncPerson(java.lang.String startDate) throws java.rmi.RemoteException;
    public java.lang.String findPersonByRole(java.lang.String r_id, int limit, int offset) throws java.rmi.RemoteException;
    public java.lang.String findPerson(java.lang.String unit_name, java.lang.String p_name, java.lang.String login_name, java.lang.String state, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String addPersonRole(java.lang.String userid, java.lang.String p_id, java.lang.String r_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updatePerson(java.lang.String userJson, java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findCmPersonType() throws java.rmi.RemoteException;
    public java.lang.String findPersonRole(java.lang.String p_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String insertPerson(java.lang.String userJson, java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateRoleByPid(java.lang.String p_id, java.lang.String role_type, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deletePerson(java.lang.String personJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String addPersonRoleBatch(java.lang.String userid, boolean isMoreUser, java.lang.String userRoles, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findCMUserRoleBySet(java.lang.String p_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String modifyPersonStateBatch(java.lang.String userid, java.lang.String plist, java.lang.String state, java.lang.String token_key) throws java.rmi.RemoteException;
}
