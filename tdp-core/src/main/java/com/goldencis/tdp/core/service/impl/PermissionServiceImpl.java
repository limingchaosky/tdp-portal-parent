package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.Permission;
import com.goldencis.tdp.core.mapper.PermissionMapper;
import com.goldencis.tdp.core.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 访问资源权限表 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
