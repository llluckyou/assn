package com.assn.controller;

import com.assn.entity.AssnActivityEntity;
import com.assn.form.ActivityForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/10.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @RequestMapping("/inputForm")
    public String inputActivityForm(ModelMap map) {
        map.addAttribute("activity", new ActivityForm());
        return "releaseActivity";
    }

    @RequestMapping("/release")
    public String release(@ModelAttribute ActivityForm activity) {
        //System.out.println(activity);
        return "";
    }
}
