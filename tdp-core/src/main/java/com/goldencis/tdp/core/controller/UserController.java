package com.goldencis.tdp.core.controller;


import com.goldencis.tdp.common.entity.ResultMsg;
import com.goldencis.tdp.core.entity.User;
import com.goldencis.tdp.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表-定义用户基本信息 前端控制器
 * </p>
 *
 * @author limingchao
 * @since 2018-09-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/{guid}")
    public ResultMsg findUserByGuid(@PathVariable("guid") String guid) {

        try {
            User user = userService.findUserByGuid(guid);
            return ResultMsg.ok(user);
        } catch (Exception e) {

            e.printStackTrace();
            return ResultMsg.build(500, e.getMessage());
        }
    }
}
