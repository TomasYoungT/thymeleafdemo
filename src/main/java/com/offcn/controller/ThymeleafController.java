package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;


@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @GetMapping("/indexPage")
    public String indexPage(Model model){
        System.out.println("------------");
        model.addAttribute("msg", "HelloThymeleaf");

        User user = new User();
        user.setId(1);
        user.setName("tom");
        user.setAge(28);
        user.setAddress("成都");
        model.addAttribute(user);
        model.addAttribute("userInfo", user);

        User user2 = new User();
        user2.setId(2);
        user2.setName("jerry");
        user2.setAge(27);
        user2.setAddress("北京");

        User user3 = new User();
        user3.setId(3);
        user3.setName("cart");
        user3.setAge(24);
        user3.setAddress("上海");
        List list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        model.addAttribute("userList",list);

        Map map = new HashMap();
        map.put("pic1", "../13.jpg");
        map.put("pic2", "../14.jpg");
        model.addAttribute("pictures",map);

        Date date = new Date();
        model.addAttribute("date", date);

        double number = 3.141492693424935;
        model.addAttribute("num", number);

        String string = "abcdefg" + "cdefghijk" + "hijkmlopq";
        model.addAttribute("str", string);

        return "index";
    }

    @GetMapping("/test")
    public String test(){return null;}
}
