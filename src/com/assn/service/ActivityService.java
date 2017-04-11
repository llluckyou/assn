package com.assn.service;

import com.assn.entity.AssnActivityEntity;
import com.assn.form.ActivityForm;

/**
 * Created by Administrator on 2017/4/9.
 */
public interface ActivityService extends BaseService<AssnActivityEntity, Long> {
    boolean add(ActivityForm activityForm);
}
