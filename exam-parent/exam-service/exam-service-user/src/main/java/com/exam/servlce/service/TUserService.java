package com.exam.servlce.service;

import com.exam.servlce.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guo
 * @since 2020-11-17
 */
public interface TUserService extends IService<TUser> {

    public List<TUser> AllTUser();

}
