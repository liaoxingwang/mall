
package com.mall.modules.mvvmoa.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.mvvmoa.entity.FormLeavem;

/**
 * 员工请假DAO接口
 * @author liugf
 * @version 2017-07-17
 */
@Mapper
public interface FormLeavemDao extends InterfaceBaseDao<FormLeavem> {
	
}