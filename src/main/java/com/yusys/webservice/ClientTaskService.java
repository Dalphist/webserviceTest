/**
 * ClientTaskService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientTaskService extends java.rmi.Remote {
    public java.lang.String findMyTaskInfo(java.lang.String user_id, java.lang.String sys_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findTaskById(java.lang.String taskId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deleteTask(java.lang.String taskId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateTask(java.lang.String taskJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String insertTask(java.lang.String taskJson, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findTaskPage(java.lang.String taskJson, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
}
