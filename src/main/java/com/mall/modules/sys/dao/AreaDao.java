
package com.mall.modules.sys.dao;

import com.mall.common.persistence.TreeDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface AreaDao extends TreeDao<Area> {
	
}
