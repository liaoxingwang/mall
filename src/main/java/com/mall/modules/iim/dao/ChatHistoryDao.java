
package com.mall.modules.iim.dao;

import java.util.List;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.iim.entity.ChatHistory;

/**
 * 聊天记录DAO接口
 * @author
 * @version 2015-12-29
 */
@Mapper
public interface ChatHistoryDao extends InterfaceBaseDao<ChatHistory> {
	
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
    List<ChatHistory> findLogList(ChatHistory entity);
	
	
	int findUnReadCount(ChatHistory chatHistory);
	
}