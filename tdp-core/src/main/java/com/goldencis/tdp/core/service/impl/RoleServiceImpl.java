package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.Role;
import com.goldencis.tdp.core.mapper.RoleMapper;
import com.goldencis.tdp.core.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
