package com.jbb.service;

import com.jbb.entity.FoodsEnt2;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/12 22:36
* @email: 737179493@qq.com
**/
public interface FoodsSer2 {
    Map getList2(FoodsEnt2 fe);

    Map tijiao2(FoodsEnt2 fe);

    FoodsEnt2 backSee2(String id);

    void delAll2(String[] arr);
}
