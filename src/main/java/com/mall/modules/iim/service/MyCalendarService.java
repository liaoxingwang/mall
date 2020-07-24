/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.mall.modules.iim.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.iim.dao.MyCalendarDao;
import com.mall.modules.iim.entity.MyCalendar;


/**
 * 日历Service
 * @author liugf
 * @version 2016-04-19
 */
@Service
@Transactional(readOnly = true)
public class MyCalendarService extends AbstractBaseService<MyCalendarDao, MyCalendar> {

	@Override
    public MyCalendar get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<MyCalendar> findList(MyCalendar myCalendar) {
		return super.findList(myCalendar);
	}
	
	@Override
    public Page<MyCalendar> findPage(Page<MyCalendar> page, MyCalendar myCalendar) {
		return super.findPage(page, myCalendar);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(MyCalendar myCalendar) {
		super.save(myCalendar);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(MyCalendar myCalendar) {
		super.delete(myCalendar);
	}
	
}