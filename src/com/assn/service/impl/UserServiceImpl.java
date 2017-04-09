package com.assn.service.impl;

import com.assn.dao.UserDao;
import com.assn.entity.AssnUserEntity;
import com.assn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/8.
 */
@Service
public class UserServiceImpl extends BaseSeriveImpl<AssnUserEntity, Long> implements UserService {
    @Resource
    private UserDao userDao;

}
