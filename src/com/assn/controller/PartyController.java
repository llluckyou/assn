package com.assn.controller;

import com.assn.entity.AssnUserEntity;
import com.assn.form.PartyForm;
import com.assn.service.CategoryService;
import com.assn.service.CreateInfoService;
import com.assn.service.PartyService;
import com.assn.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Heal on 2017/4/9.
 */
@Controller
@RequestMapping("/party")
public class PartyController {
    @Resource(name = "createInfoServiceImpl")
    private CreateInfoService createInfoService;
    @Resource(name = "schoolServiceImpl")
    private SchoolService schoolService;
    @Resource(name = "categoryServiceImpl")
    private CategoryService categoryService;

    @RequestMapping(path = "/reg_party",method = RequestMethod.GET)
    public String regParty(ModelMap map){
        map.addAttribute("schoolList",schoolService.findAll());
        map.addAttribute("categoryList",categoryService.findAll());
        return "reg_party";
    }

    @RequestMapping(path = "/reg_party",method = RequestMethod.POST)
    public String regParty(@Valid PartyForm partyForm, BindingResult result, ModelMap map, HttpSession session){
        if (!result.hasErrors()) {
            partyForm.setUserId((AssnUserEntity) session.getAttribute("user"));
            if (createInfoService.add(partyForm)){
                map.addAttribute("result","申请创办社团成功" + partyForm);
                return "result";
            }
            map.addAttribute("result","申请创办社团失败");
        }
        map.addAttribute("result","申请创办社团失败");
        return "result";
    }


}
