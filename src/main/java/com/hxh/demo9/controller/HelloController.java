package com.hxh.demo9.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hellos")
//@CrossOrigin // 允许这个Controller中的所有请求被其他域访问，局部解决跨域问题
public class HelloController {

    @GetMapping()
    public ResponseEntity<String> hello() {
        System.out.println("hello ok");
        //int n = 5 / 0;
        return new ResponseEntity<>("hello ok", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> hello2(@PathVariable("id") Integer id) {
        System.out.println("hello2 ok");
        if (id < 0) throw new IllegalArgumentException("无效id");
        return new ResponseEntity<>("hello2 ok", HttpStatus.OK);
    }


}
