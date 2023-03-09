package com.example.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
*  Demo 用于参考
* @TableName user
*/
public class User implements Serializable {

    /**
    * 用户ID
    */
    @NotNull(message="[用户ID]不能为空")
    @ApiModelProperty("用户ID")
    private Integer id;
    /**
    * 用户名
    */
    @NotBlank(message="[用户名]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户名")
    @Length(max= 255,message="编码长度不能超过255")
    private String username;
    /**
    * 密码
    */
    @NotBlank(message="[密码]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("密码")
    @Length(max= 255,message="编码长度不能超过255")
    private String password;

    /**
    * 用户ID
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 密码
    */
    private void setPassword(String password){
    this.password = password;
    }


    /**
    * 用户ID
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 密码
    */
    private String getPassword(){
    return this.password;
    }

}
