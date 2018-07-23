package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务封装类
 */
public class CmTaskInfo implements Serializable {
    private String id;
    private String uid;					//任务编号
    private String name;				//名称
    private Integer assignor;			//任务指派人Id
    private String assignorName;		//任务指派人姓名
    private Date start;					//计划任务开始时间
    private Date finish;				//计划任务结束时间
    private Date actualstart;			//实际任务开始时间
    private Date actualfinish;			//实际任务结束时间(每次提交需变更时间)
    private Integer percentcomplete;	//已完成任务工期的百分比
    private String procdesc;			//任务进展情况描述
    private Date constraintdate;		//限制日期(注:为统计里程碑延期做数据准备)
    private Integer priority;			//任务优先级Id
    private String priorityName;		//任务优先级名称
    private Integer type;				//预留
    private Integer important;			//是否必要完成Id
    private String importanteName;		//是否必要完成
    private Integer status;				//任务状态Id
    private String statusName;			//任务状态
    private Boolean summary;			//是否摘要任务
    private Boolean milestone;			//是否里程碑
    private String deliverableDescription;	//可交付成果描述
    private String projectId;			//所属项目简码
    private Integer userId;				//创建人ID
    private String userName;			//创建人姓名
    private Date updateTime;			//更新时间
    private String parentUid;			//父节点UID
    private String parentName;			//父节点名称
    private Integer updateUserId;		//更新人ID
    private String updateUserName;		//更新人姓名
    private Integer category;			//任务分类Id（如研发、测试、文档、需求等）
    private String categoryName;		//任务分类
    private Integer planAllDuration;	//计划时间内总工期 
    private Integer usedTaskDuration;	//已用工作量
    private Integer remainTaskDuration;	//剩余工作量
    private String usedPoint;			//已用工作量比例
    private String remainPoint;			//剩余工作量比例
    private Double workingHours;		//计划工时数
    private Double actualWorkingHours;	//实际工时数
    private String work;				//总工时量（预留）
    private Boolean recurring;			//是否周期性任务（预留）
    private Integer ord;				//排序（预留）
    private String relevancemilestone;	//任务关联里程碑（预留）
    private Integer stageId;			//阶段id（预留）
    private String scheduleUid;			//排期uid（预留）
    private Integer projectTaskId;		//从微软project导入的任务标识号（预留）
    private Boolean isCriticalTask;		//是否是关键任务（预留）
    private Integer criticalOrd;		//关键任务在分组中的顺序（预留）
    private Integer milestoneTypeId;	//里程碑类型id（预留）
    private Boolean isCounted;			// 0未入库,1入库（预留）
    private Integer criticalGroup;		//关键任务分组（预留）
    private String duration;			//持续时间（预留）
    private String remark;				//备注
    private Integer demandTaskId;		//关联需求任务ID
    private String demandTaskName;		//关联需求任务名称
    
    

    public Integer getDemandTaskId() {
		return demandTaskId;
	}

	public void setDemandTaskId(Integer demandTaskId) {
		this.demandTaskId = demandTaskId;
	}

	private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAssignor() {
        return assignor;
    }

    public void setAssignor(Integer assignor) {
        this.assignor = assignor;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date getActualstart() {
        return actualstart;
    }

    public void setActualstart(Date actualstart) {
        this.actualstart = actualstart;
    }

    public Date getActualfinish() {
        return actualfinish;
    }

    public void setActualfinish(Date actualfinish) {
        this.actualfinish = actualfinish;
    }

    public Integer getPercentcomplete() {
        return percentcomplete;
    }

    public void setPercentcomplete(Integer percentcomplete) {
        this.percentcomplete = percentcomplete;
    }

    public String getProcdesc() {
        return procdesc;
    }

    public void setProcdesc(String procdesc) {
        this.procdesc = procdesc;
    }

    public Date getConstraintdate() {
        return constraintdate;
    }

    public void setConstraintdate(Date constraintdate) {
        this.constraintdate = constraintdate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getImportant() {
        return important;
    }

    public void setImportant(Integer important) {
        this.important = important;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getSummary() {
        return summary;
    }

    public void setSummary(Boolean summary) {
        this.summary = summary;
    }

    public Boolean getMilestone() {
        return milestone;
    }

    public void setMilestone(Boolean milestone) {
        this.milestone = milestone;
    }

    public String getDeliverableDescription() {
        return deliverableDescription;
    }

    public void setDeliverableDescription(String deliverableDescription) {
        this.deliverableDescription = deliverableDescription;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getParentUid() {
        return parentUid;
    }

    public void setParentUid(String parentUid) {
        this.parentUid = parentUid;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getPlanAllDuration() {
        return planAllDuration;
    }

    public void setPlanAllDuration(Integer planAllDuration) {
        this.planAllDuration = planAllDuration;
    }

    public Integer getUsedTaskDuration() {
        return usedTaskDuration;
    }

    public void setUsedTaskDuration(Integer usedTaskDuration) {
        this.usedTaskDuration = usedTaskDuration;
    }

    public Integer getRemainTaskDuration() {
        return remainTaskDuration;
    }

    public void setRemainTaskDuration(Integer remainTaskDuration) {
        this.remainTaskDuration = remainTaskDuration;
    }

    public String getUsedPoint() {
        return usedPoint;
    }

    public void setUsedPoint(String usedPoint) {
        this.usedPoint = usedPoint;
    }

    public String getRemainPoint() {
        return remainPoint;
    }

    public void setRemainPoint(String remainPoint) {
        this.remainPoint = remainPoint;
    }

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    public Double getActualWorkingHours() {
        return actualWorkingHours;
    }

    public void setActualWorkingHours(Double actualWorkingHours) {
        this.actualWorkingHours = actualWorkingHours;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Boolean getRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public String getRelevancemilestone() {
        return relevancemilestone;
    }

    public void setRelevancemilestone(String relevancemilestone) {
        this.relevancemilestone = relevancemilestone;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getScheduleUid() {
        return scheduleUid;
    }

    public void setScheduleUid(String scheduleUid) {
        this.scheduleUid = scheduleUid;
    }

    public Integer getProjectTaskId() {
        return projectTaskId;
    }

    public void setProjectTaskId(Integer projectTaskId) {
        this.projectTaskId = projectTaskId;
    }

    public Boolean getIsCriticalTask() {
        return isCriticalTask;
    }

    public void setIsCriticalTask(Boolean isCriticalTask) {
        this.isCriticalTask = isCriticalTask;
    }

    public Integer getCriticalOrd() {
        return criticalOrd;
    }

    public void setCriticalOrd(Integer criticalOrd) {
        this.criticalOrd = criticalOrd;
    }

    public Integer getMilestoneTypeId() {
        return milestoneTypeId;
    }

    public void setMilestoneTypeId(Integer milestoneTypeId) {
        this.milestoneTypeId = milestoneTypeId;
    }

    public Boolean getIsCounted() {
        return isCounted;
    }

    public void setIsCounted(Boolean isCounted) {
        this.isCounted = isCounted;
    }

    public Integer getCriticalGroup() {
        return criticalGroup;
    }

    public void setCriticalGroup(Integer criticalGroup) {
        this.criticalGroup = criticalGroup;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getAssignorName() {
		return assignorName;
	}

	public void setAssignorName(String assignorName) {
		this.assignorName = assignorName;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public String getImportanteName() {
		return importanteName;
	}

	public void setImportanteName(String importanteName) {
		this.importanteName = importanteName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDemandTaskName() {
		return demandTaskName;
	}

	public void setDemandTaskName(String demandTaskName) {
		this.demandTaskName = demandTaskName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CmTaskInfo other = (CmTaskInfo) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAssignor() == null ? other.getAssignor() == null : this.getAssignor().equals(other.getAssignor()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getFinish() == null ? other.getFinish() == null : this.getFinish().equals(other.getFinish()))
            && (this.getActualstart() == null ? other.getActualstart() == null : this.getActualstart().equals(other.getActualstart()))
            && (this.getActualfinish() == null ? other.getActualfinish() == null : this.getActualfinish().equals(other.getActualfinish()))
            && (this.getPercentcomplete() == null ? other.getPercentcomplete() == null : this.getPercentcomplete().equals(other.getPercentcomplete()))
            && (this.getProcdesc() == null ? other.getProcdesc() == null : this.getProcdesc().equals(other.getProcdesc()))
            && (this.getConstraintdate() == null ? other.getConstraintdate() == null : this.getConstraintdate().equals(other.getConstraintdate()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getImportant() == null ? other.getImportant() == null : this.getImportant().equals(other.getImportant()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getMilestone() == null ? other.getMilestone() == null : this.getMilestone().equals(other.getMilestone()))
            && (this.getDeliverableDescription() == null ? other.getDeliverableDescription() == null : this.getDeliverableDescription().equals(other.getDeliverableDescription()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getParentUid() == null ? other.getParentUid() == null : this.getParentUid().equals(other.getParentUid()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getPlanAllDuration() == null ? other.getPlanAllDuration() == null : this.getPlanAllDuration().equals(other.getPlanAllDuration()))
            && (this.getUsedTaskDuration() == null ? other.getUsedTaskDuration() == null : this.getUsedTaskDuration().equals(other.getUsedTaskDuration()))
            && (this.getRemainTaskDuration() == null ? other.getRemainTaskDuration() == null : this.getRemainTaskDuration().equals(other.getRemainTaskDuration()))
            && (this.getUsedPoint() == null ? other.getUsedPoint() == null : this.getUsedPoint().equals(other.getUsedPoint()))
            && (this.getRemainPoint() == null ? other.getRemainPoint() == null : this.getRemainPoint().equals(other.getRemainPoint()))
            && (this.getWorkingHours() == null ? other.getWorkingHours() == null : this.getWorkingHours().equals(other.getWorkingHours()))
            && (this.getActualWorkingHours() == null ? other.getActualWorkingHours() == null : this.getActualWorkingHours().equals(other.getActualWorkingHours()))
            && (this.getWork() == null ? other.getWork() == null : this.getWork().equals(other.getWork()))
            && (this.getRecurring() == null ? other.getRecurring() == null : this.getRecurring().equals(other.getRecurring()))
            && (this.getOrd() == null ? other.getOrd() == null : this.getOrd().equals(other.getOrd()))
            && (this.getRelevancemilestone() == null ? other.getRelevancemilestone() == null : this.getRelevancemilestone().equals(other.getRelevancemilestone()))
            && (this.getStageId() == null ? other.getStageId() == null : this.getStageId().equals(other.getStageId()))
            && (this.getScheduleUid() == null ? other.getScheduleUid() == null : this.getScheduleUid().equals(other.getScheduleUid()))
            && (this.getProjectTaskId() == null ? other.getProjectTaskId() == null : this.getProjectTaskId().equals(other.getProjectTaskId()))
            && (this.getIsCriticalTask() == null ? other.getIsCriticalTask() == null : this.getIsCriticalTask().equals(other.getIsCriticalTask()))
            && (this.getCriticalOrd() == null ? other.getCriticalOrd() == null : this.getCriticalOrd().equals(other.getCriticalOrd()))
            && (this.getMilestoneTypeId() == null ? other.getMilestoneTypeId() == null : this.getMilestoneTypeId().equals(other.getMilestoneTypeId()))
            && (this.getIsCounted() == null ? other.getIsCounted() == null : this.getIsCounted().equals(other.getIsCounted()))
            && (this.getCriticalGroup() == null ? other.getCriticalGroup() == null : this.getCriticalGroup().equals(other.getCriticalGroup()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAssignor() == null) ? 0 : getAssignor().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getFinish() == null) ? 0 : getFinish().hashCode());
        result = prime * result + ((getActualstart() == null) ? 0 : getActualstart().hashCode());
        result = prime * result + ((getActualfinish() == null) ? 0 : getActualfinish().hashCode());
        result = prime * result + ((getPercentcomplete() == null) ? 0 : getPercentcomplete().hashCode());
        result = prime * result + ((getProcdesc() == null) ? 0 : getProcdesc().hashCode());
        result = prime * result + ((getConstraintdate() == null) ? 0 : getConstraintdate().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getImportant() == null) ? 0 : getImportant().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getMilestone() == null) ? 0 : getMilestone().hashCode());
        result = prime * result + ((getDeliverableDescription() == null) ? 0 : getDeliverableDescription().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getParentUid() == null) ? 0 : getParentUid().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getPlanAllDuration() == null) ? 0 : getPlanAllDuration().hashCode());
        result = prime * result + ((getUsedTaskDuration() == null) ? 0 : getUsedTaskDuration().hashCode());
        result = prime * result + ((getRemainTaskDuration() == null) ? 0 : getRemainTaskDuration().hashCode());
        result = prime * result + ((getUsedPoint() == null) ? 0 : getUsedPoint().hashCode());
        result = prime * result + ((getRemainPoint() == null) ? 0 : getRemainPoint().hashCode());
        result = prime * result + ((getWorkingHours() == null) ? 0 : getWorkingHours().hashCode());
        result = prime * result + ((getActualWorkingHours() == null) ? 0 : getActualWorkingHours().hashCode());
        result = prime * result + ((getWork() == null) ? 0 : getWork().hashCode());
        result = prime * result + ((getRecurring() == null) ? 0 : getRecurring().hashCode());
        result = prime * result + ((getOrd() == null) ? 0 : getOrd().hashCode());
        result = prime * result + ((getRelevancemilestone() == null) ? 0 : getRelevancemilestone().hashCode());
        result = prime * result + ((getStageId() == null) ? 0 : getStageId().hashCode());
        result = prime * result + ((getScheduleUid() == null) ? 0 : getScheduleUid().hashCode());
        result = prime * result + ((getProjectTaskId() == null) ? 0 : getProjectTaskId().hashCode());
        result = prime * result + ((getIsCriticalTask() == null) ? 0 : getIsCriticalTask().hashCode());
        result = prime * result + ((getCriticalOrd() == null) ? 0 : getCriticalOrd().hashCode());
        result = prime * result + ((getMilestoneTypeId() == null) ? 0 : getMilestoneTypeId().hashCode());
        result = prime * result + ((getIsCounted() == null) ? 0 : getIsCounted().hashCode());
        result = prime * result + ((getCriticalGroup() == null) ? 0 : getCriticalGroup().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", assignor=").append(assignor);
        sb.append(", start=").append(start);
        sb.append(", finish=").append(finish);
        sb.append(", actualstart=").append(actualstart);
        sb.append(", actualfinish=").append(actualfinish);
        sb.append(", percentcomplete=").append(percentcomplete);
        sb.append(", procdesc=").append(procdesc);
        sb.append(", constraintdate=").append(constraintdate);
        sb.append(", priority=").append(priority);
        sb.append(", type=").append(type);
        sb.append(", important=").append(important);
        sb.append(", status=").append(status);
        sb.append(", summary=").append(summary);
        sb.append(", milestone=").append(milestone);
        sb.append(", deliverableDescription=").append(deliverableDescription);
        sb.append(", projectId=").append(projectId);
        sb.append(", userId=").append(userId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", parentUid=").append(parentUid);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", category=").append(category);
        sb.append(", planAllDuration=").append(planAllDuration);
        sb.append(", usedTaskDuration=").append(usedTaskDuration);
        sb.append(", remainTaskDuration=").append(remainTaskDuration);
        sb.append(", usedPoint=").append(usedPoint);
        sb.append(", remainPoint=").append(remainPoint);
        sb.append(", workingHours=").append(workingHours);
        sb.append(", actualWorkingHours=").append(actualWorkingHours);
        sb.append(", work=").append(work);
        sb.append(", recurring=").append(recurring);
        sb.append(", ord=").append(ord);
        sb.append(", relevancemilestone=").append(relevancemilestone);
        sb.append(", stageId=").append(stageId);
        sb.append(", scheduleUid=").append(scheduleUid);
        sb.append(", projectTaskId=").append(projectTaskId);
        sb.append(", isCriticalTask=").append(isCriticalTask);
        sb.append(", criticalOrd=").append(criticalOrd);
        sb.append(", milestoneTypeId=").append(milestoneTypeId);
        sb.append(", isCounted=").append(isCounted);
        sb.append(", criticalGroup=").append(criticalGroup);
        sb.append(", duration=").append(duration);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}