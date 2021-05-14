package com.jbb.controller;

import com.jbb.entity.FoodsEnt2;
import com.jbb.service.FoodsSer2;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/12 22:33
* @email: 737179493@qq.com
**/
@RestController
@RequestMapping("foods2")
public class FoodsCon2 {
    @Autowired
    private FoodsSer2 fs2;

    //加载列表
    @RequestMapping("getList2")
    public Map getList2(@RequestBody FoodsEnt2 fe){
        Map map = fs2.getList2( fe);
        return map;
    }

    //提交
    @RequestMapping("tijiao2")
    public Map tijiao2(FoodsEnt2 fe){
        return fs2.tijiao2( fe);
    }

    //回显
    @RequestMapping("backSee2")
    public FoodsEnt2 backSee2(String id){
        return fs2.backSee2( id);
    }

    //组合删除
    @DeleteMapping("delAll2")
    public void delAll2( String[] arr){
        fs2.delAll2( arr);
    }



}
