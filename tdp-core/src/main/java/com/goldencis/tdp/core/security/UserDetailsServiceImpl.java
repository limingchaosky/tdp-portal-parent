package com.goldencis.tdp.core.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goldencis.tdp.core.Constants.Constants;
import com.goldencis.tdp.core.service.IUserService;
import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by limingchao on 2018/9/25.
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<com.goldencis.tdp.core.entity.User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        com.goldencis.tdp.core.entity.User user = userService.getOne(queryWrapper);

        if (user == null) {
            throw new UsernameNotFoundException("用户名或密码不正确！");
        }

        if (user.getStatus() != Constants.ACCOUNT_STATUS_ENABLE) {
            throw new LockedException("用户已被锁定！");
        }

        //为当前用户添加角色
        Collection<GrantedAuthority> auths = new ArrayList<>();
        GrantedAuthority sim = new SimpleGrantedAuthority("ROLE_USER");
        auths.add(sim);
        User userDetails = new User(username, user.getPassword(), auths);

        return userDetails;
    }
}
