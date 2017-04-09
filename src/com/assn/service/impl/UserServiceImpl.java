package com.assn.service.impl;

import com.assn.dao.UserDao;
import com.assn.entity.AssnUserEntity;
import com.assn.service.UserService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/8.
 */
public class UserServiceImpl extends BaseSeriveImpl<AssnUserEntity, Long> implements UserService {
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

}
