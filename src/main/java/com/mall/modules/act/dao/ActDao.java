package com.mall.modules.act.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.act.entity.Act;
import org.apache.ibatis.annotations.Mapper;

/**
 * 审批DAO接口
 * @author
 * @version
 */
@Mapper
public interface ActDao extends InterfaceBaseDao<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
