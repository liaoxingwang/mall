package com.mall.modules.cms.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.cms.entity.Guestbook;
import org.apache.ibatis.annotations.Mapper;

/**
 * 留言DAO接口
 * @author
 * @version
 */
@Mapper
public interface GuestbookDao extends InterfaceBaseDao<Guestbook> {

}
