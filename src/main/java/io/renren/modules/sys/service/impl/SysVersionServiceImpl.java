package io.renren.modules.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.renren.modules.sys.dao.SysVersionDao;
import io.renren.modules.sys.entity.SysVersionEntity;
import io.renren.modules.sys.service.SysVersionService;



@Service("sysVersionService")
public class SysVersionServiceImpl implements SysVersionService {
	@Autowired
	private SysVersionDao sysVersionDao;
	
	@Override
	public SysVersionEntity queryObject(Long versionId){
		return sysVersionDao.queryObject(versionId);
	}

	@Override
	public SysVersionEntity query(Map<String, Object> map) {
		return sysVersionDao.query(map);
	}

	@Override
	public List<SysVersionEntity> queryList(Map<String, Object> map){
		return sysVersionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sysVersionDao.queryTotal(map);
	}
	
	@Override
	public void save(SysVersionEntity sysVersion){
		sysVersion.setCreateTime(new Date());
		sysVersionDao.save(sysVersion);
	}
	
	@Override
	public void update(SysVersionEntity sysVersion){
		sysVersionDao.update(sysVersion);
	}
	
	@Override
	public void delete(Long versionId){
		sysVersionDao.delete(versionId);
	}
	
	@Override
	public void deleteBatch(Long[] versionIds){
		sysVersionDao.deleteBatch(versionIds);
	}

	@Override
	public SysVersionEntity selectOne(String type, String versionNo) {
		Map<String,Object> map = new HashMap<>();
		map.put("versionType",type);
		map.put("versionNo",versionNo);
		return this.query(map);
	}

}
