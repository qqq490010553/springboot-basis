package io.renren.modules.sys.service;

import io.renren.modules.sys.entity.SysVersionEntity;

import java.util.List;
import java.util.Map;

/**
 * app版本控制服务
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-18 17:35:07
 */
public interface SysVersionService {
	
	SysVersionEntity queryObject(Long versionId);

	SysVersionEntity query(Map<String, Object> map);
	
	List<SysVersionEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysVersionEntity sysVersion);
	
	void update(SysVersionEntity sysVersion);
	
	void delete(Long versionId);
	
	void deleteBatch(Long[] versionIds);

	SysVersionEntity selectOne(String type,String versionNo);
}
