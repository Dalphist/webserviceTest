/**
 * ClientChangeRecordService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yusys.webservice;

public interface ClientChangeRecordService extends java.rmi.Remote {
    public java.lang.String addChangeDataRecord(java.lang.String name, java.lang.String submit_id, java.lang.String thisChangeId, java.lang.String sys_id, java.lang.String branch_id, java.lang.String task_id, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String updateChangeDataRecord(java.lang.String recordIds, java.lang.String branch_id, java.lang.String nextBranch_id, java.lang.String opt_person, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String addChangeDataFile(java.lang.String change_id, java.lang.String name, java.lang.String path, java.lang.String type, int insert_count, int delete_count, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findMergeAddChangeDataFile(java.lang.String thisChangeId, java.lang.String nextChangeId, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataTagRecord(java.lang.String submitId, java.lang.String branchId, java.lang.String sys_id, java.lang.String tag_name, java.lang.String token_key, int limit, int offset) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataRecordTagBySysId(java.lang.String sys_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findBranchNameByBranchName(java.lang.String branch_name, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String deleteChangeDataTagRecord(java.lang.String tagIds, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findSysFlagDevelopModeState(java.lang.String flag, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findTaskIdByChangeId(java.lang.String changeId, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataTagRecordForBranch(java.lang.String submitId, java.lang.String branchId, java.lang.String sys_id, java.lang.String tag_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findBranchNameByParentId(java.lang.String parent_id, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findDomainNameIp(java.lang.String infoFlag, java.lang.String userId, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataRecord(java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataRecordByPage(java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String createChangeDataTagRecord(java.lang.String branch_id, java.lang.String tag_name, java.lang.String changeRecordIds, java.lang.String opt_person, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataByTagId(java.lang.String tag_id, int limit, int offset, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findChangeDataRecordById(java.lang.String new_change_id, java.lang.String branchId, java.lang.String nextBranch_id, java.lang.String person_name, java.lang.String task_name, java.lang.String change_name, java.lang.String develop_mode_name, java.lang.String token_key) throws java.rmi.RemoteException;
    public java.lang.String findBranchStateByBranchName(java.lang.String branch_name, java.lang.String token_key) throws java.rmi.RemoteException;
}
