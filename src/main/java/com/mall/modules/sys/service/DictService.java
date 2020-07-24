
package com.mall.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.common.utils.CacheUtils;
import com.mall.common.service.AbstractBaseService;
import com.mall.modules.sys.dao.DictDao;
import com.mall.modules.sys.entity.Dict;
import com.mall.modules.sys.utils.DictUtils;

/**
 * 字典Service
 * @author
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class DictService extends AbstractBaseService<DictDao, Dict> {
	
	/**
	 * 查询字段类型列表
	 * @return
	 */
	public List<String> findTypeList(){
		return dao.findTypeList(new Dict());
	}

	@Override
    @Transactional(readOnly = false)
	public void save(Dict dict) {
		super.save(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

	@Override
    @Transactional(readOnly = false)
	public void delete(Dict dict) {
		super.delete(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

}
