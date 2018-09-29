package com.goldencis.tdp.core.service;

import com.goldencis.tdp.core.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表-定义用户基本信息 服务类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
public interface IUserService extends IService<User> {

    User findUserByGuid(String guid);


    void batchSave(List<User> userList) throws Exception;
}
