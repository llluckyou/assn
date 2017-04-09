package com.assn.service.impl;

import com.assn.dao.BaseDao;
import com.assn.service.BaseService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 */
public class BaseSeriveImpl<Entity, PK extends Serializable> implements BaseService<Entity, PK>{

    @Resource(name="baseDaoImpl")
    private BaseDao<Entity, PK> baseDao;

    @Override
    public void add(Entity entity) {
        baseDao.add(entity);
    }

    @Override
    public void delete(Entity entity) {
        baseDao.delete(entity);
    }

    @Override
    public void deleteByPK(PK pk, String pkName) {
        baseDao.deleteByPK(pk, pkName);
    }

    @Override
    public void update(Entity entity) {
        baseDao.update(entity);
    }

    @Override
    public Entity get(PK pk) {
        return baseDao.get(pk);
    }

    @Override
    public Entity load(PK pk) {
        return baseDao.load(pk);
    }

    @Override
    public List<Entity> findAll() {
        return baseDao.findAll();
    }
}
