package com.exam.servlce.controller;


import com.exam.servlce.entity.TUser;
import com.exam.servlce.service.TUserService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author guo
 * @since 2020-11-17
 */
@RestController
@RequestMapping("/servlce/t-user")
@CrossOrigin //解决跨域问题 1.协议问题dsfds
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @ResponseBody
    @GetMapping(value = "/AllUser",produces = { "application/json;charset=UTF-8"})
    public Result<List<TUser>> AllUser(){
        List<TUser> tUsers = tUserService.AllTUser();
        return new Result(true, StatusCode.OK,"OK",tUsers);
    }

}

