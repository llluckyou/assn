package com.assn.controller;

import com.assn.entity.AssnUserEntity;
import com.assn.form.LoginForm;
import com.assn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Heal on 2017/4/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userServiceImpl")
    private UserService userService;

    private final String FAILED = "registerFailed";
    private final String SUCCESS = "registerSuccess";

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest httpServletRequest,AssnUserEntity userEntity, ModelMap map) {
        Map<String, Object> condition = new HashMap<>();
        condition.put("userName", userEntity);
        if(userService.findUnique(condition) != null) {
            map.addAttribute("registerInfo", "当前用户已经存在");
            return FAILED;
        }

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        userEntity.setUserImgPath("null");
        userEntity.setUserLastLogTime(currentTime);

        userEntity.setUserCreateTime(currentTime);
        userEntity.setUserLastLogIp(httpServletRequest.getRemoteAddr());
        userEntity.setUserStatus("N");
        userEntity.setSchoolId(1);
        userService.add(userEntity);
        map.addAttribute("userInfo", userEntity);
        map.addAttribute("registerInfo", "注册成功");
        System.out.println(userEntity);
        return SUCCESS;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginForm loginForm) {

    }
}
