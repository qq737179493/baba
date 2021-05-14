package com.jbb.entity;

import lombok.Data;

import java.io.Serializable;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/12 22:11
* @email: 737179493@qq.com
**/
@Data
public class FeignFoodEnt implements Serializable {
    private String id;
    private String name;
    private Integer price;
    private String type;
    private String date;
    private Integer statu;

    private Integer page;
    private Integer rows;
    private Integer minRows;
}
