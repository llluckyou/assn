package com.assn.dao.impl;

import com.assn.dao.DaoSupport;
import com.assn.dao.UserDao;
import com.assn.entity.AssnUserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/4/8.
 * 用户表
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<AssnUserEntity, Long> implements UserDao {

}
