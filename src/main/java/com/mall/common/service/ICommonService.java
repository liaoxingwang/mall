package com.mall.common.service;

import com.mall.common.persistence.Page;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Service基类
 *
 * @author
 * @version
 */
public interface ICommonService<T> {
    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 获取单条数据
     *
     * @param entity
     * @return
     */
    T get(T entity);

    /**
     * 查询列表数据
     *
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    /**
     * 查询所有
     *
     * @param entity
     * @return
     */
    List<T> findAllList(T entity);

    /**
     * 查询分页数据
     *
     * @param page   分页对象
     * @param entity
     * @return
     */
    Page<T> findPage(Page<T> page, T entity) ;

    /**
     * 保存数据（插入或更新）
     *
     * @param entity
     */
    @Transactional(readOnly = false)
    void save(T entity) ;

    /**
     * 删除数据
     *
     * @param entity
     */
    @Transactional(readOnly = false)
    void delete(T entity);

}
