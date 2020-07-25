package com.mall.modules.cms.service;

import com.mall.common.service.AbstractBaseService;
import com.mall.modules.cms.dao.ArticleDataDao;
import com.mall.modules.cms.entity.ArticleData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 站点Service
 * @author
 * @version
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends AbstractBaseService<ArticleDataDao, ArticleData> {

}
