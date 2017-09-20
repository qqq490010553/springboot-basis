package io.renren.modules.api.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;
import io.renren.modules.api.annotation.AuthIgnore;
import io.renren.modules.sys.entity.SysVersionEntity;
import io.renren.modules.sys.service.SysVersionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * app版本更新
 *
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-18 17:35:07
 */
@RestController
@RequestMapping("/api")
public class ApiVersionController {
	@Autowired
	private SysVersionService sysVersionService;

	/**
	 * 列表
	 * @param type android、IOS(必填参数)
	 * @param versionNo 1(必填参数)
	 */
	@AuthIgnore
	@RequestMapping("/new")
	public R list(@RequestParam String type,@RequestParam String versionNo){
		SysVersionEntity version = sysVersionService.selectOne(type,versionNo);
		if (null == version){
			return R.ok("当前版本已是最新");
		}
		return R.ok().put("version",version);
	}
	
}
