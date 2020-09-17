package com.yan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    @NotNull(message = "不为空")
    private int age;
    @NotNull(message = "不为空")
    private String sex;
    @Length(min=1, max=10,message = "长度在1到10之间")
    private String empName;
    @NotEmpty(message = "地址不能为空")
    private String address;
}
