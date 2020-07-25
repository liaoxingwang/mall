package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论DAO接口
 * @author
 * @version
 */
@Mapper
public interface CommentDao extends InterfaceBaseDao<Comment> {

}
