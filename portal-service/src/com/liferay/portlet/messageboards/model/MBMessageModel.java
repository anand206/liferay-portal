/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBMessage service. Represents a row in the &quot;MBMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBMessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MBMessage
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageImpl
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageModelImpl
 * @generated
 */
public interface MBMessageModel extends AttachedModel, BaseModel<MBMessage>,
	StagedGroupedModel, TrashedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message-boards message model instance should use the {@link MBMessage} interface instead.
	 */

	/**
	 * Returns the primary key of this message-boards message.
	 *
	 * @return the primary key of this message-boards message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message-boards message.
	 *
	 * @param primaryKey the primary key of this message-boards message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this message-boards message.
	 *
	 * @return the uuid of this message-boards message
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this message-boards message.
	 *
	 * @param uuid the uuid of this message-boards message
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the message ID of this message-boards message.
	 *
	 * @return the message ID of this message-boards message
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this message-boards message.
	 *
	 * @param messageId the message ID of this message-boards message
	 */
	public void setMessageId(long messageId);

	/**
	 * Returns the group ID of this message-boards message.
	 *
	 * @return the group ID of this message-boards message
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this message-boards message.
	 *
	 * @param groupId the group ID of this message-boards message
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this message-boards message.
	 *
	 * @return the company ID of this message-boards message
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this message-boards message.
	 *
	 * @param companyId the company ID of this message-boards message
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this message-boards message.
	 *
	 * @return the user ID of this message-boards message
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this message-boards message.
	 *
	 * @param userId the user ID of this message-boards message
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this message-boards message.
	 *
	 * @return the user uuid of this message-boards message
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this message-boards message.
	 *
	 * @param userUuid the user uuid of this message-boards message
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this message-boards message.
	 *
	 * @return the user name of this message-boards message
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this message-boards message.
	 *
	 * @param userName the user name of this message-boards message
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this message-boards message.
	 *
	 * @return the create date of this message-boards message
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this message-boards message.
	 *
	 * @param createDate the create date of this message-boards message
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this message-boards message.
	 *
	 * @return the modified date of this message-boards message
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message-boards message.
	 *
	 * @param modifiedDate the modified date of this message-boards message
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this message-boards message.
	 *
	 * @return the fully qualified class name of this message-boards message
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this message-boards message.
	 *
	 * @return the class name ID of this message-boards message
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this message-boards message.
	 *
	 * @param classNameId the class name ID of this message-boards message
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this message-boards message.
	 *
	 * @return the class p k of this message-boards message
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this message-boards message.
	 *
	 * @param classPK the class p k of this message-boards message
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the category ID of this message-boards message.
	 *
	 * @return the category ID of this message-boards message
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this message-boards message.
	 *
	 * @param categoryId the category ID of this message-boards message
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the thread ID of this message-boards message.
	 *
	 * @return the thread ID of this message-boards message
	 */
	public long getThreadId();

	/**
	 * Sets the thread ID of this message-boards message.
	 *
	 * @param threadId the thread ID of this message-boards message
	 */
	public void setThreadId(long threadId);

	/**
	 * Returns the root message ID of this message-boards message.
	 *
	 * @return the root message ID of this message-boards message
	 */
	public long getRootMessageId();

	/**
	 * Sets the root message ID of this message-boards message.
	 *
	 * @param rootMessageId the root message ID of this message-boards message
	 */
	public void setRootMessageId(long rootMessageId);

	/**
	 * Returns the parent message ID of this message-boards message.
	 *
	 * @return the parent message ID of this message-boards message
	 */
	public long getParentMessageId();

	/**
	 * Sets the parent message ID of this message-boards message.
	 *
	 * @param parentMessageId the parent message ID of this message-boards message
	 */
	public void setParentMessageId(long parentMessageId);

	/**
	 * Returns the subject of this message-boards message.
	 *
	 * @return the subject of this message-boards message
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this message-boards message.
	 *
	 * @param subject the subject of this message-boards message
	 */
	public void setSubject(String subject);

	/**
	 * Returns the body of this message-boards message.
	 *
	 * @return the body of this message-boards message
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this message-boards message.
	 *
	 * @param body the body of this message-boards message
	 */
	public void setBody(String body);

	/**
	 * Returns the format of this message-boards message.
	 *
	 * @return the format of this message-boards message
	 */
	@AutoEscape
	public String getFormat();

	/**
	 * Sets the format of this message-boards message.
	 *
	 * @param format the format of this message-boards message
	 */
	public void setFormat(String format);

	/**
	 * Returns the anonymous of this message-boards message.
	 *
	 * @return the anonymous of this message-boards message
	 */
	public boolean getAnonymous();

	/**
	 * Returns <code>true</code> if this message-boards message is anonymous.
	 *
	 * @return <code>true</code> if this message-boards message is anonymous; <code>false</code> otherwise
	 */
	public boolean isAnonymous();

	/**
	 * Sets whether this message-boards message is anonymous.
	 *
	 * @param anonymous the anonymous of this message-boards message
	 */
	public void setAnonymous(boolean anonymous);

	/**
	 * Returns the priority of this message-boards message.
	 *
	 * @return the priority of this message-boards message
	 */
	public double getPriority();

	/**
	 * Sets the priority of this message-boards message.
	 *
	 * @param priority the priority of this message-boards message
	 */
	public void setPriority(double priority);

	/**
	 * Returns the allow pingbacks of this message-boards message.
	 *
	 * @return the allow pingbacks of this message-boards message
	 */
	public boolean getAllowPingbacks();

	/**
	 * Returns <code>true</code> if this message-boards message is allow pingbacks.
	 *
	 * @return <code>true</code> if this message-boards message is allow pingbacks; <code>false</code> otherwise
	 */
	public boolean isAllowPingbacks();

	/**
	 * Sets whether this message-boards message is allow pingbacks.
	 *
	 * @param allowPingbacks the allow pingbacks of this message-boards message
	 */
	public void setAllowPingbacks(boolean allowPingbacks);

	/**
	 * Returns the answer of this message-boards message.
	 *
	 * @return the answer of this message-boards message
	 */
	public boolean getAnswer();

	/**
	 * Returns <code>true</code> if this message-boards message is answer.
	 *
	 * @return <code>true</code> if this message-boards message is answer; <code>false</code> otherwise
	 */
	public boolean isAnswer();

	/**
	 * Sets whether this message-boards message is answer.
	 *
	 * @param answer the answer of this message-boards message
	 */
	public void setAnswer(boolean answer);

	/**
	 * Returns the status of this message-boards message.
	 *
	 * @return the status of this message-boards message
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this message-boards message.
	 *
	 * @param status the status of this message-boards message
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this message-boards message.
	 *
	 * @return the status by user ID of this message-boards message
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this message-boards message.
	 *
	 * @param statusByUserId the status by user ID of this message-boards message
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this message-boards message.
	 *
	 * @return the status by user uuid of this message-boards message
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this message-boards message.
	 *
	 * @param statusByUserUuid the status by user uuid of this message-boards message
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this message-boards message.
	 *
	 * @return the status by user name of this message-boards message
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this message-boards message.
	 *
	 * @param statusByUserName the status by user name of this message-boards message
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this message-boards message.
	 *
	 * @return the status date of this message-boards message
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this message-boards message.
	 *
	 * @param statusDate the status date of this message-boards message
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the trash entry created when this message-boards message was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this message-boards message.
	 *
	 * @return the trash entry created when this message-boards message was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this message-boards message.
	 *
	 * @return the class primary key of the trash entry for this message-boards message
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this message-boards message.
	 *
	 * @return the trash handler for this message-boards message
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this message-boards message is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this message-boards message is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this message-boards message is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this message-boards message is in the Recycle Bin; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean isInTrashContainer();

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this message-boards message is approved.
	 *
	 * @return <code>true</code> if this message-boards message is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this message-boards message is denied.
	 *
	 * @return <code>true</code> if this message-boards message is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this message-boards message is a draft.
	 *
	 * @return <code>true</code> if this message-boards message is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this message-boards message is expired.
	 *
	 * @return <code>true</code> if this message-boards message is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this message-boards message is inactive.
	 *
	 * @return <code>true</code> if this message-boards message is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this message-boards message is incomplete.
	 *
	 * @return <code>true</code> if this message-boards message is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this message-boards message is pending.
	 *
	 * @return <code>true</code> if this message-boards message is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this message-boards message is scheduled.
	 *
	 * @return <code>true</code> if this message-boards message is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MBMessage mbMessage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MBMessage> toCacheModel();

	@Override
	public MBMessage toEscapedModel();

	@Override
	public MBMessage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}