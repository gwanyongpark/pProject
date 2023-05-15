package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {
    @RequestMapping(method = RequestMethod.GET) // login 요청 중 get 방식으로만 들어올 때 메소드 사용한다는 뜻
    public String loginForm(){
        log.info("get | /login ");
        return "member/loginForm";

    }
    @RequestMapping(method = RequestMethod.POST) // login 요청 중 post 방식으로만 들어올 때 메소드 사용한다는 뜻
    public String login(
            HttpServletRequest request,
            RedirectAttributes redirectAttributes
    ){
        log.info("post | /login ");

        // 로그인 처리
        HttpSession session = request.getSession();
        session.setAttribute("loginInfo", "Login");
        log.info("로그인 처리");

        redirectAttributes.addAttribute("no", 10);
        redirectAttributes.addAttribute("page", 13);
        redirectAttributes.addFlashAttribute("type", "user");


        // post 처리 후 redirect 처리
        return "redirect:/sample/sample1";
        // http://localhost:8080/sample/sample1
    }

}
