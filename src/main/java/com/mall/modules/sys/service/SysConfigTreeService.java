
package com.mall.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.service.TreeService;
import com.mall.common.utils.StringUtils;
import com.mall.modules.sys.entity.SysConfigTree;
import com.mall.modules.sys.dao.SysConfigTreeDao;

/**
 * 系统配置Service
 * @author mall
 * @version 2018-08-22
 */
@Service
@Transactional(readOnly = true)
public class SysConfigTreeService extends TreeService<SysConfigTreeDao, SysConfigTree> {

	@Override
    public SysConfigTree get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<SysConfigTree> findList(SysConfigTree sysConfig) {
		if (StringUtils.isNotBlank(sysConfig.getParentIds())){
			sysConfig.setParentIds(","+sysConfig.getParentIds()+",");
		}
		return super.findList(sysConfig);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(SysConfigTree sysConfig) {
		super.save(sysConfig);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(SysConfigTree sysConfig) {
		super.delete(sysConfig);
	}
	
}