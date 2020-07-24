/**
 * Copyright &copy; 2012-2016 <a href="https://gitee.com/JeeHuangBingGui/jeeSpringCloud">JeeSpring</a>All rights reserved.
 */
package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.Link;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 链接DAO接口
 * @author JeeSpring
 * @version 2013-8-23
 */
@Mapper
public interface LinkDao extends InterfaceBaseDao<Link> {
	
	public List<Link> findByIdIn(String[] ids);
//	{
//		return find("front Like where id in (:p1)", new Parameter(new Object[]{ids}));
//	}
	
	public int updateExpiredWeight(Link link);
//	{
//		return update("update Link set weight=0 where weight > 0 and weightDate < current_timestamp()");
//	}
//	public List<Link> fjindListByEntity();
}
