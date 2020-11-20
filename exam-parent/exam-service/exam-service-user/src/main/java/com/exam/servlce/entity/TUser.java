package com.exam.servlce.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author guo
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "t_user")
@ApiModel(value = "用户信息管理")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 账号,一般为学号或者教工号
     */
    @TableField(value = "username")
    @ApiModelProperty(value = "账号,一般为学号或者教工号")
    private String username;

    /**
     * 密码
     */

    @TableField(value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * QQ
     */
    @TableField(value = "qq")
    @ApiModelProperty(value = "qq号")
    private String qq;

    /**
     * 电话
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "电话")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "电子邮件")
    private String email;

    /**
     * 个人描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value = "个人描述")
    private String description;

    /**
     * 头像
     */
    @TableField(value = "avatar_img_url")
    @ApiModelProperty(value = "头像")
    private String avatarImgUrl;

    /**
     * 当前账号状态,0表示正常,1表示禁用
     */
    @TableField(value = "state")
    @ApiModelProperty(value = "当前账号状态,0表示正常,1表示禁用")
    private Integer state;

    /**
     * 0表示学生,1表示教师,2表示管理员
     */
    @TableField(value = "level")
    @ApiModelProperty(value = "0表示学生,1表示教师,2表示管理员")
    private Integer level;

    /**
     * 逻辑删除，1删除，0没删除
     */
    @TableField(value = "deleted")
    @ApiModelProperty(value = "逻辑删除，1删除，0没删除")
    private Boolean deleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value = "创建时间")
    private Date updateTime;


}
