
package com.mall.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface LogDao extends InterfaceBaseDao<Log> {

	void empty();
}
