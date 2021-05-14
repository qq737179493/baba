package com.jbb.service;

import com.jbb.entity.FeignFoodEnt;
import com.jbb.service.Impl.NewFeignSer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
* @Author: 颉宝宝
* @Description:
* @Date: 2021/5/13 20:12
* @email: 737179493@qq.com
**/
@FeignClient(value = "povider",fallback = NewFeignSer.class)
public interface FeignSer {
    @RequestMapping("foods2/getList2")
    Map getList(FeignFoodEnt fe);
}
