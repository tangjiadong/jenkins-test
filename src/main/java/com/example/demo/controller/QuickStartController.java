package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tang on 2021/4/19
 */
@Controller
public class QuickStartController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        System.out.println("quick方法执行");
        return "jenkins-springboot项目运行成功!";
    }

}
