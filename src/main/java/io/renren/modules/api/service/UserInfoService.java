package io.renren.modules.api.service;

import io.renren.modules.api.entity.UserInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户详细信息
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
public interface UserInfoService {
	
	UserInfoEntity queryObject(Long userInfoId);
	
	List<UserInfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserInfoEntity userInfo);
	
	void update(UserInfoEntity userInfo);
	
	void delete(Long userInfoId);
	
	void deleteBatch(Long[] userInfoIds);
}
