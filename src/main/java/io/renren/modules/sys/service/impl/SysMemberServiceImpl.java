package io.renren.modules.sys.service.impl;

import io.renren.modules.sys.dao.SysMemberDao;
import io.renren.modules.sys.entity.SysMemberEntity;
import io.renren.modules.sys.service.SysMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("memberService")
public class SysMemberServiceImpl implements SysMemberService {
	@Autowired
	private SysMemberDao memberDao;
	
	@Override
	public SysMemberEntity queryObject(Long userId){
		return memberDao.queryObject(userId);
	}
	
	@Override
	public List<SysMemberEntity> queryList(Map<String, Object> map){
		return memberDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return memberDao.queryTotal(map);
	}
	
	@Override
	public void save(SysMemberEntity user){
		memberDao.save(user);
	}
	
	@Override
	public void update(SysMemberEntity user){
		memberDao.update(user);
	}
	
	@Override
	public void delete(Long userId){
		memberDao.delete(userId);
	}
	
	@Override
	public void deleteBatch(Long[] userIds){
		memberDao.deleteBatch(userIds);
	}
	
}
