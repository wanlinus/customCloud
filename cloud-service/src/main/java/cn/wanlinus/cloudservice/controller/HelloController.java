package cn.wanlinus.cloudservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanli
 * @date 2018-07-31 16:45
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello() {
        return "Hello World: " + port;
    }
}
