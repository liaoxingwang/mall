
package com.mall.modules.job.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.job.entity.SysJob;

/**
 * 定时任务调度DAO接口
 * @author mall
 * @version 2018-08-16
 */
@Mapper
public interface SysJobDao extends InterfaceBaseDao<SysJob> {
	
}