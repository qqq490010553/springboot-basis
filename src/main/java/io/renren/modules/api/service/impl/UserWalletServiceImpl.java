package io.renren.modules.api.service.impl;

import io.renren.modules.api.dao.UserWalletDao;
import io.renren.modules.api.entity.UserWalletEntity;
import io.renren.modules.api.service.UserWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("userWalletService")
public class UserWalletServiceImpl implements UserWalletService {
	@Autowired
	private UserWalletDao userWalletDao;
	
	@Override
	public UserWalletEntity queryObject(Long userWalletId){
		return userWalletDao.queryObject(userWalletId);
	}
	
	@Override
	public List<UserWalletEntity> queryList(Map<String, Object> map){
		return userWalletDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userWalletDao.queryTotal(map);
	}
	
	@Override
	public void save(UserWalletEntity userWallet){
		userWalletDao.save(userWallet);
	}
	
	@Override
	public void update(UserWalletEntity userWallet){
		userWalletDao.update(userWallet);
	}
	
	@Override
	public void delete(Long userWalletId){
		userWalletDao.delete(userWalletId);
	}
	
	@Override
	public void deleteBatch(Long[] userWalletIds){
		userWalletDao.deleteBatch(userWalletIds);
	}
	
}
