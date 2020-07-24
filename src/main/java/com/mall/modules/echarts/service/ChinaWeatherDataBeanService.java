/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.echarts.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.echarts.entity.ChinaWeatherDataBean;
import com.mall.modules.echarts.dao.ChinaWeatherDataBeanDao;

/**
 * 城市气温Service
 * @author lgf
 * @version 2016-06-02
 */
@Service
@Transactional(readOnly = true)
public class ChinaWeatherDataBeanService extends AbstractBaseService<ChinaWeatherDataBeanDao, ChinaWeatherDataBean> {

	@Override
    public ChinaWeatherDataBean get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<ChinaWeatherDataBean> findList(ChinaWeatherDataBean chinaWeatherDataBean) {
		return super.findList(chinaWeatherDataBean);
	}
	
	@Override
    public Page<ChinaWeatherDataBean> findPage(Page<ChinaWeatherDataBean> page, ChinaWeatherDataBean chinaWeatherDataBean) {
		return super.findPage(page, chinaWeatherDataBean);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(ChinaWeatherDataBean chinaWeatherDataBean) {
		super.save(chinaWeatherDataBean);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(ChinaWeatherDataBean chinaWeatherDataBean) {
		super.delete(chinaWeatherDataBean);
	}
	
	
	
	
}