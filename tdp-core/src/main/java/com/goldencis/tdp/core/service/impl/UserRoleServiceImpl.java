package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.UserRole;
import com.goldencis.tdp.core.mapper.UserRoleMapper;
import com.goldencis.tdp.core.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
