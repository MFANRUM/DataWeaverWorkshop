package com.mf.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: MFAN
 * @Date: 2025/4/2 16:10:11
 * @Version: 1.0
 */
@RestController
@RequestMapping("payment")
public class indexController {

    @GetMapping("index")
    public String index(){
        return "index";
    }
}
