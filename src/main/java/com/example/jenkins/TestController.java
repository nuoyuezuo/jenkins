package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cai
 * @version 1.0
 * @date 2020/9/11 16:22
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String gettest(){
        return "hello1";
    }

}
