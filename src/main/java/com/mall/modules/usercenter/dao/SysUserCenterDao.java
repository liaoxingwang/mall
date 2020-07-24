
package com.mall.modules.usercenter.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.mall.modules.usercenter.entity.SysUserCenter;

/**
 * 用户中心DAO接口
 * @author 黄炳桂
 * @version 2017-12-12
 */
@Mapper
public interface SysUserCenterDao extends InterfaceBaseDao<SysUserCenter> {
	
}