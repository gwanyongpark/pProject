package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello(){
        // ModelAndView : 응답할 view 의 경로, view 에 공유할 결과 data
        ModelAndView mav = new ModelAndView();
        // view 경로를 설정(지정)
        mav.setViewName("hello"); // /WEB-INF/views/hello.jsp

        // Service 요청 -> 응답 데이터를 공유
        mav.addObject("greeting","Hello !");
        // view 로 전달한 데이터 설정

        return mav;


    }

}
