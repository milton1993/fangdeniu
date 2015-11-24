package com.mitong.fangdeniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 15-11-24
 */
@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "abc";
    }
}
