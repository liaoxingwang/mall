package com.mall.modules.gen.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.gen.entity.GenTable;
import com.mall.modules.gen.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GenTableColumnDao
  extends InterfaceBaseDao<GenTableColumn>
{
  void deleteByGenTable(GenTable paramGenTable);
}
