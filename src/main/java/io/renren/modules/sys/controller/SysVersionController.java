package io.renren.modules.sys.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.SysVersionEntity;
import io.renren.modules.sys.service.SysVersionService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 版本更新
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-18 17:35:07
 */
@RestController
@RequestMapping("/sys/version")
public class SysVersionController {
	@Autowired
	private SysVersionService sysVersionService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:version:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SysVersionEntity> sysVersionList = sysVersionService.queryList(query);
		int total = sysVersionService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(sysVersionList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{versionId}")
	@RequiresPermissions("sys:version:info")
	public R info(@PathVariable("versionId") Long versionId){
		SysVersionEntity sysVersion = sysVersionService.queryObject(versionId);
		
		return R.ok().put("sysVersion", sysVersion);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:version:save")
	public R save(@RequestBody SysVersionEntity sysVersion){
		sysVersionService.save(sysVersion);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:version:update")
	public R update(@RequestBody SysVersionEntity sysVersion){
		sysVersionService.update(sysVersion);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:version:delete")
	public R delete(@RequestBody Long[] versionIds){
		sysVersionService.deleteBatch(versionIds);
		
		return R.ok();
	}
	
}
