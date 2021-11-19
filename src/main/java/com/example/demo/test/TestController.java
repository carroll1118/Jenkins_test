package com.example.demo.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("我只是为了练习git操作！！！");
        System.out.println("练习git操作！！！");
        return "我是菜鸡，你不是，哈哈哈哈哈哈....success!";
    }
}
