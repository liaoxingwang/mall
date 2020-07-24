package com.mall.modules.gen.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.gen.entity.GenTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GenTableDao
  extends InterfaceBaseDao<GenTable>
{
  int buildTable(@Param("sql") String paramString);
}
