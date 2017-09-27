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

import io.renren.modules.api.entity.UserWalletEntity;
import io.renren.modules.api.service.UserWalletService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 用户钱包
 * 
 * @author wanmin
 * @email 460363410@qq.com
 * @date 2017-09-20 11:43:35
 */
@RestController
@RequestMapping("/sys/userwallet")
public class SysUserWalletController {

	@Autowired
	private UserWalletService walletService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:userwallet:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserWalletEntity> userWalletList = walletService.queryList(query);
		int total = walletService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userWalletList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{userWalletId}")
	@RequiresPermissions("sys:userwallet:info")
	public R info(@PathVariable("userWalletId") Long userWalletId){
		UserWalletEntity userWallet = walletService.queryObject(userWalletId);
		
		return R.ok().put("userWallet", userWallet);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:userwallet:save")
	public R save(@RequestBody UserWalletEntity userWallet){
		walletService.save(userWallet);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:userwallet:update")
	public R update(@RequestBody UserWalletEntity userWallet){
		walletService.update(userWallet);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:userwallet:delete")
	public R delete(@RequestBody Long[] userWalletIds){
		walletService.deleteBatch(userWalletIds);
		
		return R.ok();
	}
	
}
