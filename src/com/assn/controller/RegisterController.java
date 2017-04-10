package com.assn.controller;

import com.assn.entity.AssnActivityJoinEntity;
import com.assn.entity.AssnActivityJoinEntityPK;
import com.assn.service.ActivityJoinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */

@Controller
@RequestMapping("/wow")

public class RegisterController {

    @Resource
    private ActivityJoinService activityJoinService;

    @RequestMapping("/testRegister")
    public String receiveRegister() {
        System.out.println("注册");
        System.out.println(activityJoinService.get(new AssnActivityJoinEntityPK(121,123)));
        return "re";
    }

    @RequestMapping("/dispatcherRegister")
    public String dispatcherRegister(AssnActivityJoinEntity activityJoinEntity, ModelMap map) {
        System.out.println("注册成功");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        activityJoinEntity.setApplyTime(timestamp);
        System.out.println(timestamp);
        System.out.println(activityJoinEntity);
        activityJoinService.add(activityJoinEntity);
        map.addAttribute("reInfo", activityJoinEntity);
        return "register";
    }
}
