
package com.mall.modules.sys.dao;

import com.mall.common.persistence.TreeDao;
import com.mall.common.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.SysConfigTree;

/**
 * 系统配置DAO接口
 * @author mall
 * @version 2018-08-22
 */
@Mapper
public interface SysConfigTreeDao extends TreeDao<SysConfigTree> {
	
}