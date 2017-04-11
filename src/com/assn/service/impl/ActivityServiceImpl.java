package com.assn.service.impl;

import com.assn.entity.AssnActivityEntity;
import com.assn.entity.AssnPartyEntity;
import com.assn.form.ActivityForm;
import com.assn.model.formatter.DateFormatter;
import com.assn.service.ActivityService;
import com.assn.service.PartyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/9.
 */
@Service
public class ActivityServiceImpl extends BaseSeriveImpl<AssnActivityEntity, Long> implements ActivityService {
    @Resource(name = "partyServiceImpl")
    PartyService partyService;
    @Resource(name = "dateFormatter")
    DateFormatter dateFormatter;

    @Override
    public boolean add(ActivityForm activityForm) {
        AssnActivityEntity activityEntity = new AssnActivityEntity();

        //修改创建时间为当前的时间
        activityEntity.setActivityApplyTime(new Timestamp(System.currentTimeMillis()));

        //查找社团名对应的社团id
        Map<String, Object> condition = new HashMap<>();
        condition.put("partyName", activityForm.getPartyName());
        AssnPartyEntity partyEntity = partyService.findUnique(condition);
        Long partyId;
        if (partyEntity != null) {
            partyId = partyEntity.getPartyId();
        }else
            return false;
        activityEntity.setActivityPartyId(partyId);

        //添加用户id
        activityEntity.setActivityUserId(Long.valueOf(activityForm.getUserId()));

        //添加活动名称
        activityEntity.setActivityName(activityForm.getActivityName());

        //添加活动内容
        activityEntity.setActivityContent(activityForm.getActivityContent());

        //添加活动地点
        activityEntity.setActivitySpace(activityForm.getActivitySpace());

        //添加活动奖励
        activityEntity.setActivityPraise(0);


        //添加开始日期
        activityEntity.setActivityStartDate(new Timestamp(activityForm.getActivityStartDate().getTime()));
        activityEntity.setActivityEndDate(new Timestamp(activityForm.getActivityEndDate().getTime()));
//        try {
//            activityEntity.setActivityStartDate(new Timestamp(dateFormatter.parse(activityForm.getActivityStartDate(), Locale.CHINESE).getTime()));
//            activityEntity.setActivityEndDate(new Timestamp(dateFormatter.parse(activityForm.getActivityEndDate(), Locale.CHINESE).getTime()));
//        }catch (IllegalArgumentException e) {
//            e.getMessage();
//        }

        //添加活动状态
        activityEntity.setActivityStatus(AssnActivityEntity.CHECKING);

        //添加活动评分
        activityEntity.setActivityScore(0);

        add(activityEntity);
        System.out.println(activityEntity.toString());
        return true;
    }
}
