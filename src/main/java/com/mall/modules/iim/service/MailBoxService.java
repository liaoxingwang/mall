
package com.mall.modules.iim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.iim.dao.MailBoxDao;
import com.mall.modules.iim.entity.MailBox;
import com.mall.modules.iim.entity.MailPage;

/**
 * 收件箱Service
 * @author
 * @version 2015-11-13
 */
@Service
@Transactional(readOnly = true)
public class MailBoxService extends AbstractBaseService<MailBoxDao, MailBox> {

	@Autowired
	private MailBoxDao mailBoxDao;
	@Override
    public MailBox get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<MailBox> findList(MailBox mailBox) {
		return super.findList(mailBox);
	}
	
	public Page<MailBox> findPage(MailPage<MailBox> page, MailBox mailBox) {
		return super.findPage(page, mailBox);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(MailBox mailBox) {
		super.save(mailBox);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(MailBox mailBox) {
		super.delete(mailBox);
	}
	
	public int getCount(MailBox mailBox) {
		return mailBoxDao.getCount(mailBox);
	}
	
}