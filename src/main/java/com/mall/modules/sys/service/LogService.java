
package com.mall.modules.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.modules.sys.dao.LogDao;
import com.mall.modules.sys.entity.Log;
import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.common.utils.DateUtils;

/**
 * 日志Service
 * @author
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class LogService extends AbstractBaseService<LogDao, Log> {

	@Autowired
	private LogDao logDao;
	
	@Override
    public Page<Log> findPage(Page<Log> page, Log log) {
		
		// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		
		return super.findPage(page, log);
		
	}
	
	/**
	 * 删除全部数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void empty(){
		
		logDao.empty();
	}
	
}
