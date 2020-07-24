
package com.mall.modules.sys.dao;

import java.util.List;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface DictDao extends InterfaceBaseDao<Dict> {

	List<String> findTypeList(Dict dict);
	
}
