package com.test.controller;

import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;


@Controller
public class JsonBackOne {
    @RequestMapping("/test3")
    public String test(HttpServletResponse response) {
        User user = new User();
        user.setId(new BigDecimal(12));
        user.setSex("12");
        user.setUsername("phpfzh-test3");
        String date = JSON.toJSONString(user);
        try {
            sendJsonData(response, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void sendJsonData(HttpServletResponse response, String data)
            throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(data);
        out.flush();
        out.close();
    }
}
