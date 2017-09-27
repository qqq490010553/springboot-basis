package io.renren.modules.api.service;

import io.renren.modules.api.entity.UserWalletEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户钱包
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
public interface UserWalletService {
	
	UserWalletEntity queryObject(Long userWalletId);
	
	List<UserWalletEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserWalletEntity userWallet);
	
	void update(UserWalletEntity userWallet);
	
	void delete(Long userWalletId);
	
	void deleteBatch(Long[] userWalletIds);
}
