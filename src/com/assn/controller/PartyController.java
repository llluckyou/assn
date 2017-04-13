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
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    public String regParty( @RequestParam(value = "partyImg",required = false) MultipartFile file,@Valid PartyForm partyForm, BindingResult result ,ModelMap map, HttpSession session){
        if (!result.hasErrors()) {
            String partyImg = "";
            if (file != null){
                String fileOriginalName = file.getOriginalFilename();
                String extName = fileOriginalName.substring(fileOriginalName.lastIndexOf('.'));
                String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
                String path = session.getServletContext().getRealPath("upload/img/"+date);
                String fileName = System.currentTimeMillis() + extName;
                partyImg = "/upload/img/" + fileName;
                File img = new File(path,fileName);

                if (!img.exists()){ //创建目录
                    img.mkdirs();
                }
                try {
                    file.transferTo(img);
                } catch (IOException e) {
                    map.addAttribute("result","图片上传失败");
                    return "result";
                }
            }
            partyForm.setUserId((AssnUserEntity) session.getAttribute("user"));
            partyForm.setAssnImg(partyImg); //设置图片

            if (createInfoService.add(partyForm)){
                map.addAttribute("result","申请创办社团成功" + partyForm);
                return "result";
            }
        }
        for (Object o : result.getAllErrors()){
            System.out.println(o.toString());
        }
        map.addAttribute("result","申请创办社团失败");
        return "result";
    }


}
