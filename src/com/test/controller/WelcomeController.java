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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String hello(){
        return "welcome";
    }
}