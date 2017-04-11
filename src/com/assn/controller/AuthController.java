package com.assn.controller;

import com.assn.model.AuthCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/11.
 * 生成验证码
 */
@Controller

public class AuthController {

    private static final int CODE_LEN = 4;
    private static final int HEIGHT = 30;
    private static final int WIDTH = 150;

    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        request.removeAttribute("auth");
        String auth = AuthCodeUtils.generateVerifyCode(CODE_LEN);
        session.setAttribute("auth", auth);

        // 禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        response.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos = response.getOutputStream();
        AuthCodeUtils.outputImage(WIDTH, HEIGHT, sos, auth);

        sos.close();
    }
}
