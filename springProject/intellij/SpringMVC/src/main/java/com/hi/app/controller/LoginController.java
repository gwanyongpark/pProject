package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String login(){
        log.info("post | /login ");
        // post 처리 후 redirect 처리
        return "redirect:/sample/sample1";
        // http://localhost:8080/sample/sample1
    }

}
