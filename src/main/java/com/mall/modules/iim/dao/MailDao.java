
package com.mall.modules.iim.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.iim.entity.Mail;

/**
 * 发件箱DAO接口
 * * * * @author
 * @version 2015-11-15
 */
@Mapper
public interface MailDao extends InterfaceBaseDao<Mail> {
	int getCount(MailDao entity);
}