// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 2017/5/31 16:23:22
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   CgAutoListService.java

package com.mall.modules.gen.service;

import com.mall.common.persistence.Page;
import com.mall.common.service.AbstractService;
import com.mall.common.utils.StringUtils;
import com.mall.modules.gen.dao.*;
import com.mall.modules.gen.entity.*;
import com.mall.modules.gen.template.FreemarkerHelper;
import com.mall.modules.gen.util.GenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional(readOnly=true)
public class CgAutoListService extends AbstractService
{

    public CgAutoListService()
    {
    }

    public GenTable get(String id)
    {
        GenTable genTable = genTableDao.get(id);
        GenTableColumn genTableColumn = new GenTableColumn();
        genTableColumn.setGenTable(new GenTable(genTable.getId()));
        genTable.setColumnList(genTableColumnDao.findList(genTableColumn));
        return genTable;
    }

    public Page find(Page page, GenTable genTable)
    {
        genTable.setPage(page);
        page.setList(genTableDao.findList(genTable));
        return page;
    }

    public List findAll()
    {
        return genTableDao.findAllList(new GenTable());
    }

    public List findTableListFormDb(GenTable genTable)
    {
        return genDataBaseDictDao.findTableList(genTable);
    }

    public boolean checkTableName(String tableName)
    {
        if(StringUtils.isBlank(tableName)) {
            return true;
        }
        GenTable genTable = new GenTable();
        genTable.setName(tableName);
        List list = genTableDao.findList(genTable);
        return list.size() == 0;
    }

    public boolean checkTableNameFromDB(String tableName)
    {
        if(StringUtils.isBlank(tableName)) {
            return true;
        }
        GenTable genTable = new GenTable();
        genTable.setName(tableName);
        List list = genDataBaseDictDao.findTableList(genTable);
        return list.size() == 0;
    }

    public String generateCode(GenScheme genScheme)
    {
        StringBuilder result = new StringBuilder();
        GenTable genTable = genTableDao.get(genScheme.getGenTable().getId());
        genTable.setColumnList(genTableColumnDao.findList(new GenTableColumn(new GenTable(genTable.getId()))));
        com.mall.modules.gen.entity.GenConfig config = GenUtils.getConfig();
        genScheme.setGenTable(genTable);
        java.util.Map model = GenUtils.getDataModel(genScheme);
        FreemarkerHelper viewEngine = new FreemarkerHelper();
        String html = viewEngine.parseTemplate("/com.mall/modules/gen/template/viewList.ftl", model);
        return html;
    }

    public String generateListCode(GenScheme genScheme)
    {
        StringBuilder result = new StringBuilder();
        GenTable genTable = genTableDao.get(genScheme.getGenTable().getId());
        genTable.setColumnList(genTableColumnDao.findList(new GenTableColumn(new GenTable(genTable.getId()))));
        com.mall.modules.gen.entity.GenConfig config = GenUtils.getConfig();
        genScheme.setGenTable(genTable);
        java.util.Map model = GenUtils.getDataModel(genScheme);
        FreemarkerHelper viewEngine = new FreemarkerHelper();
        String html = viewEngine.parseTemplate("/com.mall/modules/gen/template/findList.ftl", model);
        return html;
    }

    @Autowired
    private GenTableDao genTableDao;
    @Autowired
    private GenTableColumnDao genTableColumnDao;
    @Autowired
    private GenDataBaseDictDao genDataBaseDictDao;
}
