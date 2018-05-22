package com.test.controller;

import com.test.entity.MyBody;
import com.test.entity.User;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AJAXOne {
    @RequestMapping(value = "/ajax1/{name}", method = RequestMethod.GET)
    public @ResponseBody
    User test_get(@PathVariable String name) {
        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("2211");
        user.setUsername(name);
        return user;
    }

    @RequestMapping(value = "/ajax1/", method = RequestMethod.POST)
    public @ResponseBody
    User test_post(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            HttpServletRequest req
    ) {

        System.out.println(name);
        System.out.println(age);

        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("2222");
        user.setUsername("ZZZZ");
        return user;
    }

    @RequestMapping(value = "/ajax2", method = RequestMethod.GET)
    public @ResponseBody
    User test2_post(
            @RequestParam("name") String name,
            @RequestParam("age") int age) {

        System.out.println(name);
        System.out.println(age);

        User user = new User();
        user.setId(new BigDecimal(age));
        user.setSex(name);
        user.setUsername(name);
        return user;
    }

    @RequestMapping(value = "/ajax2", method = RequestMethod.POST)
    public @ResponseBody
    User test3_post(@RequestBody MyBody myBody) {

        System.out.println(myBody.name);
        System.out.println(myBody.age);

        User user = new User();
        user.setId(new BigDecimal(11));
        user.setSex("zzz");
        user.setUsername("zzz");
        return user;
    }
}
