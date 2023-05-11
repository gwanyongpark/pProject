package com.exam.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/exam/regist")
public class ExamRegistController {

    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){
        log.info("get  /exam/regist");
        return "/exam/registForm";
    }
}
