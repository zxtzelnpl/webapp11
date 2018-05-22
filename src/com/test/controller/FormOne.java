package com.test.controller;

import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
@RequestMapping("/form1")
public class FormOne {
    @RequestMapping(method = RequestMethod.GET)
    public String test_get(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            Model model)

    {
        String message = "@RequestMapping(method = RequestMethod.GET)";
        User user = new User();
        user.setUsername(name);
        user.setId(new BigDecimal(age));
        user.setSex(name);
        model.addAttribute("user",user);
        model.addAttribute("message",message);
        return "formback";

    }


    @RequestMapping(method = RequestMethod.POST)
    public String test_post(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            Model model
    ) {
        String message = "@RequestMapping(method = RequestMethod.POST)";
        User user = new User();
        user.setUsername(name);
        user.setId(new BigDecimal(age));
        user.setSex(name);
        model.addAttribute("user",user);
        model.addAttribute("message",message);
        return "formback";
    }

}
