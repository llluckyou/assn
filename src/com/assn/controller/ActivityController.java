package com.assn.controller;

import com.assn.entity.AssnActivityEntity;
import com.assn.entity.AssnUserEntity;
import com.assn.form.ActivityForm;
import com.assn.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @Resource(name = "activityServiceImpl")
    ActivityService activityService;

    @RequestMapping("/inputForm")
    public String inputActivityForm(ModelMap map) {
        map.addAttribute("activity", new ActivityForm());
        return "releaseActivity";
    }

    @RequestMapping("/release")
    public String release(@Valid @ModelAttribute ActivityForm activity, BindingResult bindingResult,
                          HttpSession session) {

        activity.setUserId(((AssnUserEntity) session.getAttribute("user")).getUserId());

        if(!bindingResult.hasErrors()) {
            System.out.println(activity);
        }
        activityService.add(activity);
        return "";
    }
}
