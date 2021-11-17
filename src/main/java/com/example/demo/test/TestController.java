package com.example.demo.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {

        return "我是菜鸡，你不是，哈哈哈哈哈哈....success!";
    }
}
