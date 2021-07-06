package com.mpy.javaweb.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户")
public class User {

    @ApiModelProperty("用户ID")
    private Long id;

    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("用户年龄")
    private int age;

    @ApiModelProperty("用户邮箱")
    private String email;

}

