package com.mall.modules.gen.dao;

import com.mall.common.persistence.InterfaceBaseDao;
import com.mall.modules.gen.entity.GenTable;
import com.mall.modules.gen.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GenDataBaseDictDao
  extends InterfaceBaseDao<GenTableColumn>
{
  List<GenTable> findTableList(GenTable paramGenTable);
  
  List<GenTableColumn> findTableColumnList(GenTable paramGenTable);
  
  List<String> findTablePK(GenTable paramGenTable);
}