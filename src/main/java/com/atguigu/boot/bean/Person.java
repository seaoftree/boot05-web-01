package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Ceaate by 76819 on 2021/4/27
 */
@Data
@ToString
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
