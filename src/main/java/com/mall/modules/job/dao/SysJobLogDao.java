
package com.mall.modules.job.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.job.entity.SysJobLog;

/**
 * 定时任务调度日志表DAO接口
 * @author mall
 * @version 2018-08-16
 */
@Mapper
public interface SysJobLogDao extends InterfaceBaseDao<SysJobLog> {
	
}