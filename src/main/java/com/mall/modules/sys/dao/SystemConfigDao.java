/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.sys.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.sys.entity.SystemConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统配置DAO接口
 * @author liugf
 * @version 2016-02-07
 */
@Mapper
public interface SystemConfigDao extends InterfaceBaseDao<SystemConfig> {
	
}