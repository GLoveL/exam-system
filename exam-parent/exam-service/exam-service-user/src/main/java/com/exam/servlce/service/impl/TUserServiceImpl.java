package com.exam.servlce.service.impl;

import com.exam.servlce.entity.TUser;
import com.exam.servlce.mapper.TUserMapper;
import com.exam.servlce.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guo
 * @since 2020-11-17
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Autowired
    private TUserService tUserService;

    @Override
    public List<TUser> AllTUser() {
        return this.list();
    }
}
