package io.renren.modules.api.dao;

import io.renren.modules.api.entity.UserInfoEntity;
import io.renren.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户详细信息
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
@Mapper
public interface UserInfoDao extends BaseDao<UserInfoEntity> {
	
}
