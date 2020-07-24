/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.sys.entity.SystemConfig;
import com.mall.modules.sys.dao.SystemConfigDao;

/**
 * 系统配置Service
 * @author liugf
 * @version 2016-02-07
 */
@Service
@Transactional(readOnly = true)
public class SystemConfigService extends AbstractBaseService<SystemConfigDao, SystemConfig> {

	@Override
    public SystemConfig get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<SystemConfig> findList(SystemConfig systemConfig) {
		return super.findList(systemConfig);
	}
	
	@Override
    public Page<SystemConfig> findPage(Page<SystemConfig> page, SystemConfig systemConfig) {
		return super.findPage(page, systemConfig);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(SystemConfig systemConfig) {
		super.save(systemConfig);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(SystemConfig systemConfig) {
		super.delete(systemConfig);
	}
	
}