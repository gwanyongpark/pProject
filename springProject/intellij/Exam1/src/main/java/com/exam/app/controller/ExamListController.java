package com.exam.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class ExamListController {
    @RequestMapping("/exam/list")
    public void getExamList(){
        log.info("/exam/list");

    }

}
