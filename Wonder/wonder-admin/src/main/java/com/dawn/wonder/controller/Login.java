package com.dawn.wonder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.example.controller
 * Description:
 * Date:  2020/4/1 14:52
 * Author: kousq
 * Modified By:
 */
@RestController
@RequestMappng("/base")
public class Login {

    @RequestMapping("/login")
    public String login() {
        System.out.println("Hello Spring boot");
        return "hello word!";

    }

}
