package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.springboot.domain.UserEntity;
import com.springboot.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

    @GetMapping({"/", "/index", "/home"})
    public String root(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(UserEntity userEntity){
        // 此处省略校验逻辑
        if (userService.insert(userEntity))
            return "redirect:register.do?success";
        return "redirect:register.do?error";
    }
}
