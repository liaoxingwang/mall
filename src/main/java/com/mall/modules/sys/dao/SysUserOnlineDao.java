
package com.mall.modules.sys.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.SysUserOnline;

/**
 * 在线用户记录DAO接口
 * @author mall
 * @version 2018-08-16
 */
@Mapper
public interface SysUserOnlineDao extends InterfaceBaseDao<SysUserOnline> {
	
}