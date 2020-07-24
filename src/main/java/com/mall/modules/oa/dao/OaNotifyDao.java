
package com.mall.modules.oa.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.oa.entity.OaNotify;

/**
 * 通知通告DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface OaNotifyDao extends InterfaceBaseDao<OaNotify> {
	
	/**
	 * 获取通知数目
	 * @param oaNotify
	 * @return
	 */
    Long findCount(OaNotify oaNotify);
	
}