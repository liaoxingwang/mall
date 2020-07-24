
package com.mall.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.service.TreeService;
import com.mall.common.utils.StringUtils;
import com.mall.modules.sys.entity.SysDictTree;
import com.mall.modules.sys.dao.SysDictTreeDao;

/**
 * 数据字典Service
 * @author mall
 * @version 2018-08-22
 */
@Service
@Transactional(readOnly = true)
public class SysDictTreeService extends TreeService<SysDictTreeDao, SysDictTree> {

	@Override
    public SysDictTree get(String id) {
		return super.get(id);
	}
	
	@Override
    public List<SysDictTree> findList(SysDictTree sysDict) {
		if (StringUtils.isNotBlank(sysDict.getParentIds())){
			sysDict.setParentIds(","+sysDict.getParentIds()+",");
		}
		return super.findList(sysDict);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void save(SysDictTree sysDict) {
		super.save(sysDict);
	}
	
	@Override
    @Transactional(readOnly = false)
	public void delete(SysDictTree sysDict) {
		super.delete(sysDict);
	}
	
}