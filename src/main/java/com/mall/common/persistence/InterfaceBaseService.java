package com.mall.common.persistence;

import java.util.List;

/**
 * DAO支持类实现
 *
 * @param <T>
 * @author
 * @version 2014-05-16
 */
public interface InterfaceBaseService<T> {

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

    T getCache(String id);

    List<T> totalCache(T entity);
    /**
     * 查询统计列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     *
     * @param entity
     * @return
     */
    List<T> total(T entity);

    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     *
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    List<T> findAllList(T entity);

    List<T> findListCache(T entity);

    Page<T> findPage(Page<T> page, T entity);

    Page<T> findPageCache(Page<T> page, T entity);

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    void save(T entity);

    /**
     * 删除数据（一般为逻辑删除，更新del_flag字段为1）
     *
     * @param entity
     * @return
     * @see public int delete(T entity)
     * @Deprecated
     */
    void delete(T entity);

	/**
	 * 删除数据（逻辑删除，更新del_flag字段为1,在表包含字段del_flag时，可以调用此方法，将数据隐藏）
	 * @param entity
	 * @see public int delete(T entity)
	 * @return
     * 	@Deprecated
	 */
    void deleteByLogic(T entity);


}