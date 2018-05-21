package com.test.controller;

//通过配置文件
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class WelcomeController implements Controller {
//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        //System.out.println("welcome");
//        return new ModelAndView("welcome");
//    }
//
//}


//通过注解
import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String hello(Model model){
        String message = "这个是要传递的数据";
        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("男");
        user.setUsername("ZXT");
        model.addAttribute("user",user);
        model.addAttribute("message",message);
        return "welcome";
    }

    @RequestMapping("/welcome1")
    public ModelAndView hello2(Model model){
        String message = "这个是要传递的数据";
        User user = new User();
        user.setId(new BigDecimal(22));
        user.setSex("女");
        user.setUsername("HQ");
        model.addAttribute("user",user);
        model.addAttribute("message",message);
        ModelAndView mad =  new ModelAndView();
        mad.setViewName("welcome");
        mad.addObject("message", message);
        mad.addObject("user", user);
        return mad;
    }


    @RequestMapping("/welcome2")
    public String hello4(Model model){
        String message = "这个是要传递的数据";
        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("男");
        user.setUsername("ZXasdfT");
        model.addAttribute("user",user);
        model.addAttribute("message",message);
        return "welcome";
    }
}