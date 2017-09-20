package io.renren.modules.sys.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 版本管理
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-18 17:35:07
 */
public class SysVersionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long versionId;
	//版本号
	private String versionNo;
	//版本标题
	private String versionTitle;
	//发布内容
	private String versionContent;
	//版本类型(Android、IOS)
	private String versionType;
	//是否强制更新
	private String forceUpdate;
	//下载地址
	private String downloadUrl;
	//是否有效
	private String isValid;
	//创建人
	private Long createBy;
	//修改人
	private Long updateBy;
	//创建时间
	private Date createTime;
	//创建时间
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	/**
	 * 获取：
	 */
	public Long getVersionId() {
		return versionId;
	}
	/**
	 * 设置：版本号
	 */
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	/**
	 * 获取：版本号
	 */
	public String getVersionNo() {
		return versionNo;
	}
	/**
	 * 设置：版本标题
	 */
	public void setVersionTitle(String versionTitle) {
		this.versionTitle = versionTitle;
	}
	/**
	 * 获取：版本标题
	 */
	public String getVersionTitle() {
		return versionTitle;
	}
	/**
	 * 设置：发布内容
	 */
	public void setVersionContent(String versionContent) {
		this.versionContent = versionContent;
	}
	/**
	 * 获取：发布内容
	 */
	public String getVersionContent() {
		return versionContent;
	}
	/**
	 * 设置：版本类型(Android、IOS)
	 */
	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}
	/**
	 * 获取：版本类型(Android、IOS)
	 */
	public String getVersionType() {
		return versionType;
	}
	/**
	 * 设置：是否强制更新
	 */
	public void setForceUpdate(String forceUpdate) {
		this.forceUpdate = forceUpdate;
	}
	/**
	 * 获取：是否强制更新
	 */
	public String getForceUpdate() {
		return forceUpdate;
	}
	/**
	 * 设置：下载地址
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	/**
	 * 获取：下载地址
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}
	/**
	 * 设置：是否有效
	 */
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	/**
	 * 获取：是否有效
	 */
	public String getIsValid() {
		return isValid;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建人
	 */
	public Long getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：修改人
	 */
	public Long getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
