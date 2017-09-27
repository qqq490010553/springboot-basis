package io.renren.modules.api.service.impl;

import io.renren.modules.api.dao.UserInfoDao;
import io.renren.modules.api.entity.UserInfoEntity;
import io.renren.modules.api.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfoEntity queryObject(Long userInfoId){
		return userInfoDao.queryObject(userInfoId);
	}
	
	@Override
	public List<UserInfoEntity> queryList(Map<String, Object> map){
		return userInfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userInfoDao.queryTotal(map);
	}
	
	@Override
	public void save(UserInfoEntity userInfo){
		userInfoDao.save(userInfo);
	}
	
	@Override
	public void update(UserInfoEntity userInfo){
		userInfoDao.update(userInfo);
	}
	
	@Override
	public void delete(Long userInfoId){
		userInfoDao.delete(userInfoId);
	}
	
	@Override
	public void deleteBatch(Long[] userInfoIds){
		userInfoDao.deleteBatch(userInfoIds);
	}
	
}
