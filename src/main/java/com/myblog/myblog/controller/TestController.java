package com.myblog.myblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:zyk
 * @Description:
 * @Date:Create in 11:00 2017/11/22
 * @Modified By:
 **/
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index() {

        return "index";
    }


}
