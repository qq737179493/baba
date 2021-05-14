package com.jbb.service.Impl;

import com.jbb.entity.FeignFoodEnt;
import com.jbb.service.FeignSer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/13 20:12
* @email: 737179493@qq.com
**/
@Component
public class NewFeignSer implements FeignSer {

    @Override
    public Map getList(FeignFoodEnt fe) {
        System.out.println("查询出错了");
        return null;
    }
}
