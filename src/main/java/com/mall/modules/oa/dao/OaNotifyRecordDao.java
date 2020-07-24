
package com.mall.modules.oa.dao;

import java.util.List;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.oa.entity.OaNotifyRecord;

/**
 * 通知通告记录DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface OaNotifyRecordDao extends InterfaceBaseDao<OaNotifyRecord> {

	/**
	 * 插入通知记录
	 * @param oaNotifyRecordList
	 * @return
	 */
    int insertAll(List<OaNotifyRecord> oaNotifyRecordList);
	
	/**
	 * 根据通知ID删除通知记录
	 * @param oaNotifyId 通知ID
	 * @return
	 */
    int deleteByOaNotifyId(String oaNotifyId);
	
}