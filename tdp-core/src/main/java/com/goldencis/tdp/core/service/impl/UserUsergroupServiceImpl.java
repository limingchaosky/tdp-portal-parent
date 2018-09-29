package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.UserUsergroup;
import com.goldencis.tdp.core.mapper.UserUsergroupMapper;
import com.goldencis.tdp.core.service.IUserUsergroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和用户组关联表 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
@Service
public class UserUsergroupServiceImpl extends ServiceImpl<UserUsergroupMapper, UserUsergroup> implements IUserUsergroupService {

}
