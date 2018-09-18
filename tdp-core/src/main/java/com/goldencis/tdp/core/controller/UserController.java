package com.goldencis.tdp.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by limingchao on 2018/9/14.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/index")
    public String indexPage(Model model) {
        System.out.println("visit index site!");

        model.addAttribute("tdpTime", new Date());
        return "index";
    }

}
