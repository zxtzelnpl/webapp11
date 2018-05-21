package com.test.controller;

import com.test.entity.User;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test2")
public class JsonBackTwo {
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody User test(@PathVariable String name){
        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("12");
        user.setUsername(name);
        return user;
    }
}
