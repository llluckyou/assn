package com.assn.service.impl;

import com.assn.dao.ActivityJoinDao;
import com.assn.entity.AssnActivityCommentEntity;
import com.assn.entity.AssnActivityJoinEntity;
import com.assn.entity.AssnActivityJoinEntityPK;
import com.assn.service.ActivityJoinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Heal on 2017/4/8.
 */

@Service
public class ActivityJoinServiceImpl extends BaseSeriveImpl<AssnActivityJoinEntity, AssnActivityJoinEntityPK> implements ActivityJoinService {
}
