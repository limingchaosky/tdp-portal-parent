package com.goldencis.tdp.core.service.impl;

import com.goldencis.tdp.core.entity.Operation;
import com.goldencis.tdp.core.mapper.OperationMapper;
import com.goldencis.tdp.core.service.IOperationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 功能操作表 服务实现类
 * </p>
 *
 * @author limingchao
 * @since 2018-09-27
 */
@Service
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements IOperationService {

}
