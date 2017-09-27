package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;
import io.renren.modules.sys.entity.SysMemberEntity;
import io.renren.modules.sys.service.SysMemberService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;




/**
 * 会员管理
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
@RestController
@RequestMapping("/sys/member")
public class SysMemberController {
	@Autowired
	private SysMemberService sysMemberService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:member:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysMemberEntity> userList = sysMemberService.queryList(query);
		int total = sysMemberService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{userId}")
	@RequiresPermissions("sys:member:info")
	public R info(@PathVariable("userId") Long userId){
		SysMemberEntity user = sysMemberService.queryObject(userId);
		
		return R.ok().put("user", user);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:member:save")
	public R save(@RequestBody SysMemberEntity user){
		sysMemberService.save(user);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:member:update")
	public R update(@RequestBody SysMemberEntity user){
		sysMemberService.update(user);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:member:delete")
	public R delete(@RequestBody Long[] userIds){
		sysMemberService.deleteBatch(userIds);
		
		return R.ok();
	}
	
}
