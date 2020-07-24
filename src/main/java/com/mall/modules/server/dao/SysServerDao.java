
package com.mall.modules.server.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.server.entity.SysServer;

/**
 * 服务器监控DAO接口
 * @author mall
 * @version 2018-08-20
 */
@Mapper
public interface SysServerDao extends InterfaceBaseDao<SysServer> {
	
}