/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.monitor.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.monitor.entity.Monitor;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统监控DAO接口
 * @author mall
 * @version 2016-02-07
 */
@Mapper
public interface MonitorDao extends InterfaceBaseDao<Monitor> {
	
}