package com.assn.controller;

import com.assn.entity.AssnActivityEntity;
import com.assn.entity.AssnUserEntity;
import com.assn.form.ActivityForm;
import com.assn.service.ActivityService;
import com.assn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    public static final String RELEASE = "releaseActivity";

    @Resource(name = "activityServiceImpl")
    ActivityService activityService;

    @RequestMapping("/inputForm")
    public String inputActivityForm(ModelMap map, HttpSession session ) {
        Object user = session.getAttribute("user");
        if(user == null) {
            return "redirect:/html/login.html";
        }

        map.addAttribute("activity", new ActivityForm());
        return RELEASE;
    }

    @RequestMapping("/release")
    public String release(@Valid @ModelAttribute ActivityForm activity, BindingResult bindingResult,
                          HttpSession session) {
session.setAttribute("user", new AssnUserEntity());
        activity.setUserId(((AssnUserEntity) session.getAttribute("user")).getUserId());

        if(!bindingResult.hasErrors()) {
            System.out.println(activity);
        }
        activityService.add(activity);
        return "";
    }
}
