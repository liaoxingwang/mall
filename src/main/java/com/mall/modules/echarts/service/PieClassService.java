/**
 * Copyright &copy; 2015-2020 <a href="http://www.mall.org/">mall</a> All rights reserved.
 */
package com.mall.modules.echarts.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.echarts.entity.PieClass;
import com.mall.modules.echarts.dao.PieClassDao;

/**
 * 班级Service
 * @author mall
 * @version 2016-05-26
 */
@Service
@Transactional(readOnly = true)
public class PieClassService extends AbstractBaseService<PieClassDao, PieClass> {

	@Override
    public PieClass get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<PieClass> findList(PieClass pieClass) {
		return super.findList(pieClass);
	}
	
	@Override
    public Page<PieClass> findPage(Page<PieClass> page, PieClass pieClass) {
		return super.findPage(page, pieClass);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(PieClass pieClass) {
		super.save(pieClass);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(PieClass pieClass) {
		super.delete(pieClass);
	}
	
	
	
	
}