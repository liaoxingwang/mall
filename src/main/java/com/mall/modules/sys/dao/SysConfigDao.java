
package com.mall.modules.sys.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.SysConfig;

/**
 * 系统配置DAO接口
 * @author
 * @version 2017-11-17
 */
@Mapper
public interface SysConfigDao extends InterfaceBaseDao<SysConfig> {
	
}