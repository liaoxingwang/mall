
package com.mall.modules.iim.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.iim.dao.ChatHistoryDao;
import com.mall.modules.iim.entity.ChatHistory;

/**
 * 聊天记录Service
 * @author
 * @version 2015-12-29
 */
@Service
@Transactional(readOnly = true)
public class ChatHistoryService extends AbstractBaseService<ChatHistoryDao, ChatHistory> {

	@Override
    public ChatHistory get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<ChatHistory> findList(ChatHistory chatHistory) {
		return super.findList(chatHistory);
	}
	
	
	@Override
    public Page<ChatHistory> findPage(Page<ChatHistory> page, ChatHistory entity) {
		entity.setPage(page);
		page.setList(dao.findLogList(entity));
		return page;
	}
	
	
	@Override
    @Transactional(readOnly = false)
	public void save(ChatHistory chatHistory) {
		super.save(chatHistory);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(ChatHistory chatHistory) {
		super.delete(chatHistory);
	}
	
	public int findUnReadCount(ChatHistory chatHistory){
		return dao.findUnReadCount(chatHistory);
	}
	
}