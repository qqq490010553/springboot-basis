package io.renren.modules.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 用户钱包
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
public class UserWalletEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long userWalletId;
	//用户id
	private Long userId;
	//真是金额（即可提现金额）
	private BigDecimal realMoney;
	//冻结金额
	private BigDecimal freezeMoney;
	//积分
	private BigDecimal score;
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

	/**
	 * 设置：
	 */
	public void setUserWalletId(Long userWalletId) {
		this.userWalletId = userWalletId;
	}
	/**
	 * 获取：
	 */
	public Long getUserWalletId() {
		return userWalletId;
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
	 * 设置：真是金额（即可提现金额）
	 */
	public void setRealMoney(BigDecimal realMoney) {
		this.realMoney = realMoney;
	}
	/**
	 * 获取：真是金额（即可提现金额）
	 */
	public BigDecimal getRealMoney() {
		return realMoney;
	}
	/**
	 * 设置：冻结金额
	 */
	public void setFreezeMoney(BigDecimal freezeMoney) {
		this.freezeMoney = freezeMoney;
	}
	/**
	 * 获取：冻结金额
	 */
	public BigDecimal getFreezeMoney() {
		return freezeMoney;
	}
	/**
	 * 设置：积分
	 */
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	/**
	 * 获取：积分
	 */
	public BigDecimal getScore() {
		return score;
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
}
