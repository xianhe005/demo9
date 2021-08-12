package com.hxh.demo9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("demo")
    public String demo() {
        try {
            System.out.println("demo ok");
            int n = 1 / 0; // 这里会出现异常
        } catch (Exception e) {
            e.printStackTrace();
            //return "500";
        }
        return "hello";
    }

    @RequestMapping("demo2")
    public String demo2() {
        System.out.println("demo2 ok");
        int n = 1 / 0; // 这里会出现异常
        return "hello";
    }
}
