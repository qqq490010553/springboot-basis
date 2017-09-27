package io.renren.modules.sys.service;

import io.renren.modules.sys.entity.SysMemberEntity;

import java.util.List;
import java.util.Map;

/**
 * 会员管理
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
public interface SysMemberService {

	SysMemberEntity queryObject(Long userId);
	
	List<SysMemberEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysMemberEntity user);
	
	void update(SysMemberEntity user);
	
	void delete(Long userId);
	
	void deleteBatch(Long[] userIds);
}
