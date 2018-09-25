package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.User;
import com.goldencis.tdp.core.mapper.UserMapper;
import com.goldencis.tdp.core.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表-定义用户基本信息 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
