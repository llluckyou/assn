package com.assn.controller;

import com.assn.form.PartyForm;
import com.assn.service.CategoryService;
import com.assn.service.PartyService;
import com.assn.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

/**
 * Created by Heal on 2017/4/9.
 */
@Controller
@RequestMapping("/party")
public class PartyController {
    private PartyService partyService;
    private SchoolService schoolService;
    private CategoryService categoryService;

    @Autowired
    public void setPartyService(PartyService partyService) {
        this.partyService = partyService;
    }
    @Autowired
    public void setSchoolService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(path = "/reg_party",method = RequestMethod.GET)
    public String regParty(ModelMap map){
        map.addAttribute("schoolList",schoolService.findAll());
        map.addAttribute("categoryList",categoryService.findAll());
        return "reg_party";
    }

    @RequestMapping(path = "/reg_party",method = RequestMethod.POST)
    public void regParty(@Valid PartyForm partyForm, BindingResult result){
        if (!result.hasErrors()) {
            System.out.println(partyForm.toString());
        }
    }


}
