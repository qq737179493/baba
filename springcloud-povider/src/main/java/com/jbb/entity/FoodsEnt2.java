package com.jbb.entity;

import lombok.Data;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/12 22:40
* @email: 737179493@qq.com
**/
@Data
@Document(collection = "foods")
public class FoodsEnt2 implements Serializable {
    private String id;
    private String name;
    private Integer price;
    private String type;
    private String date;
    private Integer statu;

    @Transient
    private Integer page;
    @Transient
    private Integer rows;
    @Transient
    private Integer minRows;
}
