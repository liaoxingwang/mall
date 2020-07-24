/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.mall.modules.iim.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.iim.entity.MyCalendar;
import org.apache.ibatis.annotations.Mapper;


/**
 * 日历DAO接口
 * @author mall
 * @version 2016-04-19
 */
@Mapper
public interface MyCalendarDao extends InterfaceBaseDao<MyCalendar> {
	
}