/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.echarts.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.echarts.entity.ChinaWeatherDataBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * 城市气温DAO接口
 * @author lgf
 * @version 2016-06-02
 */
@Mapper
public interface ChinaWeatherDataBeanDao extends InterfaceBaseDao<ChinaWeatherDataBean> {

	
}