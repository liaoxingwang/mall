/**
 * Copyright &copy; 2012-2016 <a href="https://gitee.com/JeeHuangBingGui/jeeSpringCloud">JeeSpring</a>All rights reserved.
 */
package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论DAO接口
 * @author JeeSpring
 * @version 2013-8-23
 */
@Mapper
public interface CommentDao extends InterfaceBaseDao<Comment> {

}
