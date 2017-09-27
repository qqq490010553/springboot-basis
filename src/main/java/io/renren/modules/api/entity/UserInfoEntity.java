package io.renren.modules.api.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户详细信息
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
public class UserInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long userInfoId;
	//用户id
	private Long userId;
	//用户头像
	private String headImg;
	//真是姓名
	private String realName;
	//推荐码
	private String recommendCode;
	//推荐人用户id
	private Long parentId;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;
	//创建人
	private Long createBy;
	//修改人
	private Long updateBy;
	//是否有效
	private Integer isValid;
	//支付密码
	private String payPwd;
	//会员等级(ordinary:普通会员)
	private String userLeve;

	/**
	 * 设置：
	 */
	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
	}
	/**
	 * 获取：
	 */
	public Long getUserInfoId() {
		return userInfoId;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：用户头像
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	/**
	 * 获取：用户头像
	 */
	public String getHeadImg() {
		return headImg;
	}
	/**
	 * 设置：真是姓名
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * 获取：真是姓名
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * 设置：推荐码
	 */
	public void setRecommendCode(String recommendCode) {
		this.recommendCode = recommendCode;
	}
	/**
	 * 获取：推荐码
	 */
	public String getRecommendCode() {
		return recommendCode;
	}
	/**
	 * 设置：推荐人用户id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：推荐人用户id
	 */
	public Long getParentId() {
		return parentId;
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
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
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
	 * 设置：是否有效
	 */
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
	/**
	 * 获取：是否有效
	 */
	public Integer getIsValid() {
		return isValid;
	}
	/**
	 * 设置：支付密码
	 */
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	/**
	 * 获取：支付密码
	 */
	public String getPayPwd() {
		return payPwd;
	}
	/**
	 * 设置：会员等级(ordinary:普通会员)
	 */
	public void setUserLeve(String userLeve) {
		this.userLeve = userLeve;
	}
	/**
	 * 获取：会员等级(ordinary:普通会员)
	 */
	public String getUserLeve() {
		return userLeve;
	}
}
