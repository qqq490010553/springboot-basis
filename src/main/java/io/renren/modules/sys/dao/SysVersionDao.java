package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.SysVersionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 版本管理
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-18 17:35:07
 */
@Mapper
public interface SysVersionDao extends BaseDao<SysVersionEntity> {
    SysVersionEntity query(Map<String, Object> map);
}
