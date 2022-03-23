package com.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Summer
 * @date 2022/3/22 19:14
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "success.jsp";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
