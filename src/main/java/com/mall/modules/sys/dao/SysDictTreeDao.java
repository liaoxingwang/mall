
package com.mall.modules.sys.dao;

import com.mall.common.persistence.TreeDao;
import com.mall.common.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.SysDictTree;

/**
 * 数据字典DAO接口
 * @author mall
 * @version 2018-08-22
 */
@Mapper
public interface SysDictTreeDao extends TreeDao<SysDictTree> {
	
}