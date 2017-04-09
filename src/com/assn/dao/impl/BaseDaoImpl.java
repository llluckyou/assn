package com.assn.dao.impl;

import com.assn.dao.BaseDao;
import com.assn.dao.DaoSupport;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * Created by Administrator on 2017/4/8.
 */
@Repository
public abstract class BaseDaoImpl<Entity, PK extends Serializable> extends DaoSupport implements BaseDao<Entity, PK> {

    /**
     * 实体类类型信息
     */
    private Class<Entity> entityClass;

    /**
     * entityManager用于创建CriteriaBuilder
     */
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 获取泛型第一个参数的类型信息
     */
    @SuppressWarnings("unchecked")
    protected BaseDaoImpl() {
        entityClass = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * 添加
     *
     * @param entity
     */
    public void add(Entity entity) {
        getHibernateTemplate().save(entity);
    }

    /**
     * 删除
     *
     * @param entity
     */
    public void delete(Entity entity) {
        getHibernateTemplate().delete(entity);
    }

    /**
     * 通过主键删除记录
     *
     * @param pk     主键值
     * @param pkName 主键名称
     */
    public void deleteByPK(final PK pk, final String pkName) {
        Integer count = getHibernateTemplate().execute(session -> {
                    Assert.hasText(pkName, "主键名错误");
                    Assert.notNull(pk, "主键为空");

                    String hql = "delete from " + entityClass.getName() + " where " + pkName + ":=pk";
                    Query query = session.createQuery(hql);
                    if (pk instanceof Integer) {
                        query.setParameter(0, pk, IntegerType.INSTANCE);
                    } else if (pk instanceof Long) {
                        query.setParameter(0, pk, LongType.INSTANCE);
                    } else if (pk instanceof String) {
                        query.setParameter(0, pk);
                    } else {
                        delete(get(pk));
                        return 0;
                    }
                    return query.executeUpdate();
                });

        if (count != 1) {
            throw new RuntimeException("Delete failed");
        }
    }

    /**
     * 修改数据
     *
     * @param entity
     */
    public void update(Entity entity) {
        getHibernateTemplate().update(entity);
    }

    /**
     * 通过主键获取数据
     *
     * @param pk 主键值
     * @return
     */
    public Entity get(PK pk) {
        return getHibernateTemplate().get(entityClass, pk);
    }

    /**
     * 通过主键获取数据，延迟加载
     *
     * @param pk
     * @return
     */
    public Entity load(PK pk) {
        return getHibernateTemplate().load(entityClass, pk);
    }

    /**
     * 获取表的全部数据
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Entity> findAll() {
        return (List<Entity>) getHibernateTemplate().find("from " + entityClass.getName());
    }

    /**
     * 根据条件查询唯一对象
     *
     * @Param map 多个键值对的eq比较
     * @return Entity
     */
    public Entity findUnique(final Map<String, Object> map) {
        //安全查询创建工厂
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        //安全查询实例
        CriteriaQuery<Entity> criteriaQuery = criteriaBuilder.createQuery(entityClass);
        //定义查询中能出现的类型，一般为实体类对应的类型
        Root<Entity> from = criteriaQuery.from(entityClass);
        //过滤条件
        List<Predicate> predicateList = new ArrayList<Predicate>();

        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        //将map中的键值对逐一进行添加，生成过滤条件，默认使用and连接
        for (Map.Entry<String, Object> entry : entrySet) {
            predicateList.add(criteriaBuilder.equal(from.get(entry.getKey()), entry.getValue()));
        }

        criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()]));

        TypedQuery<Entity> typedQuery = entityManager.createQuery(criteriaQuery);

        return typedQuery.getSingleResult();
    }

    /**
     * 根据条件查询多个对象
     *
     * @Param map String 为对应的字段名，Object为字段对应的对象，可以获取到对应的值
     * @return List<Entity>
     */
    public List<Entity> findListByMap(final Map<String, Object> map) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Entity> criteriaQuery = criteriaBuilder.createQuery(entityClass);
        Root<Entity> from = criteriaQuery.from(entityClass);
        List<Predicate> predicateList = new ArrayList<Predicate>();
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for(Map.Entry<String, Object> entry : entrySet) {
            predicateList.add(criteriaBuilder.equal(from.get(entry.getKey()), entry.getValue()));
        }

        criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()]));

        TypedQuery<Entity> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }


}
