package com.assn.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/9.
 */
public interface BaseService<Entity, PK> {
    /**
     * 增加一条记录
     * @Param entity
     */
    void add(Entity entity);

    /**
     * 删除一条记录
     * @Param entity
     */
    void delete(Entity entity);

    /**
     * 通过主键删除一条记录
     * @Param PK
     */
    void deleteByPK(final PK pk, final String pkName);

    /**
     * 修改一条记录
     * @Param entity
     */
    void update(Entity entity);

    /**
     * 查询一条记录
     * @Param pk
     */
    Entity get(PK pk);

    /**
     * 查询一条记录，延迟加载
     * @Param PK
     */
    Entity load(PK pk);

    /**
     * 查询全部
     * @return
     */
    List<Entity> findAll();

    /**
     * 根据条件查询唯一对象
     * @param map
     * @return
     */
    Entity findUnique(final Map<String, Object> map);

    /**
     * 根据条件查询多个对象
     * @param map
     * @return
     */
    List<Entity> findListByMap(final Map<String, Object> map);
}
