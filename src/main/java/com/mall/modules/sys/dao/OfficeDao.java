
package com.mall.modules.sys.dao;

import com.mall.common.persistence.TreeDao;
import com.mall.modules.sys.entity.Office;
import org.apache.ibatis.annotations.Mapper;

/**
 * 机构DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface OfficeDao extends TreeDao<Office> {
	
	Office getByCode(String code);
}
