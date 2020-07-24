/**
 * Copyright &copy; 2012-2016 <a href="https://gitee.com/JeeHuangBingGui/jeeSpringCloud">JeeSpring</a>All rights reserved.
 */
package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.Article;
import com.mall.modules.cms.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文章DAO接口
 * @author JeeSpring
 * @version 2013-8-23
 */
@Mapper
public interface ArticleDao extends InterfaceBaseDao<Article> {
	
	public List<Article> findByIdIn(String[] ids);
//	{
//		return find("from Article where id in (:p1)", new Parameter(new Object[]{ids}));
//	}
	
	public int updateHitsAddOne(String id);
//	{
//		return update("update Article set hits=hits+1 where id = :p1", new Parameter(id));
//	}
	
	public int updateExpiredWeight(Article article);
	
	public List<Category> findStats(Category category);
//	{
//		return update("update Article set weight=0 where weight > 0 and weightDate < current_timestamp()");
//	}
	
}
