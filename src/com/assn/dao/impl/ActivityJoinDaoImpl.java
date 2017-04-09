package com.assn.dao.impl;

import com.assn.dao.ActivityJoinDao;
import com.assn.dao.DaoSupport;
import com.assn.entity.AssnActivityJoinEntity;
import com.assn.entity.AssnActivityJoinEntityPK;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/4/5.
 */
@Repository
public class ActivityJoinDaoImpl extends BaseDaoImpl<AssnActivityJoinEntity, AssnActivityJoinEntityPK> implements ActivityJoinDao {
}
