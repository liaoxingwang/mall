package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.ArticleData;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章DAO接口
 * @author
 * @version
 */
@Mapper
public interface ArticleDataDao extends InterfaceBaseDao<ArticleData> {
	
}
