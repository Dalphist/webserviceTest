/**
 * ClientBranchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientBranchService extends java.rmi.Remote {
    public java.lang.String queryTagNames(java.lang.String sys_flag, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findBranch(java.lang.String repo_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String addBranch(java.lang.String userid, java.lang.String repoid, java.lang.String type, java.lang.String branchName, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deleteBranch(java.lang.String userid, java.lang.String branchId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String addBranchByBranch(java.lang.String userid, java.lang.String repoid, java.lang.String type, java.lang.String branchName, java.lang.String byBranchId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateBranchIsDevelopState(java.lang.String user_id, java.lang.String branch_name, java.lang.String repoid, java.lang.String state, java.lang.String token_key) throws java.rmi.RemoteException;
}
