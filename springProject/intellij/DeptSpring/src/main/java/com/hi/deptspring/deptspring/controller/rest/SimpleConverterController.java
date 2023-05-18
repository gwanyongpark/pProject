package com.hi.deptspring.deptspring.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/mc/simple")
@Log4j2
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("GET /mc/simple ...  Form ");
    }

    @PostMapping
    @ResponseBody // form 요청을 body 영역에 저장
    public String simple(
            @RequestBody String body
    ){

        log.info("body >>> " + body);

        return "body >>>> ";
        // @ResponseBody가 없으면 /WEB-INF/views/body >>>> .jsp
    }
}
