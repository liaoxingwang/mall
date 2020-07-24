
package com.mall.modules.sys.dao;

import java.util.List;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.sys.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单DAO接口
 * @author
 * @version 2014-05-16
 */
@Mapper
public interface MenuDao extends InterfaceBaseDao<Menu> {

	List<Menu> findByParentIdsLike(Menu menu);

	List<Menu> findByUserId(Menu menu);
	
	int updateParentIds(Menu menu);
	
	int updateSort(Menu menu);
	
}
