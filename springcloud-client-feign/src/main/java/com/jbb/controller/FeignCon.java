package com.jbb.controller;

import com.jbb.entity.FeignFoodEnt;
import com.jbb.service.FeignSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/13 20:08
* @email: 737179493@qq.com
**/
@RestController
@RequestMapping("feign_food")
@SuppressWarnings("all")
public class FeignCon {
    @Autowired
    private FeignSer feignSer;

    @RequestMapping("test1")
    public Map getList(FeignFoodEnt fe){
        Map map = feignSer.getList(fe);
        return map;
    }

}
