package com.assn.dao;

import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 */
public interface BaseDao<Entity, PK> {
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
}
