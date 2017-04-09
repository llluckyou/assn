package com.assn.service.impl;

import com.assn.dao.BaseDao;
import com.assn.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 */
@Service
public abstract class BaseSeriveImpl<Entity, PK extends Serializable> implements BaseService<Entity, PK>{

    @Autowired
    private BaseDao<Entity, PK> baseDao;

    public void add(Entity entity) {
        baseDao.add(entity);
    }

    public void delete(Entity entity) {
        baseDao.delete(entity);
    }

    public void deleteByPK(PK pk, String pkName) {
        baseDao.deleteByPK(pk, pkName);
    }

    public void update(Entity entity) {
        baseDao.update(entity);
    }

    public Entity get(PK pk) {
        return baseDao.get(pk);
    }

    public Entity load(PK pk) {
        return baseDao.load(pk);
    }

    public List<Entity> findAll() {
        return baseDao.findAll();
    }
}
