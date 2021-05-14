package com.jbb.service.Impl;

import com.jbb.entity.FoodsEnt2;
import com.jbb.service.FoodsSer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewFoodsSer2 implements FoodsSer2 {
    @Autowired
    private MongoTemplate mongoTemplate;

    //加载列表
    @Override
    public Map getList2(FoodsEnt2 fe) {
        Query query = new Query();

       // query.skip((fe.getPage()-1)*fe.getRows());
        //query.limit(fe.getRows());

        List<FoodsEnt2> lis = mongoTemplate.find(query , FoodsEnt2.class);
        long count = mongoTemplate.count(query,  FoodsEnt2.class);

        Map map = new HashMap();
        map.put("rows",lis);
        map.put("total",count);
        return map;
    }

    @Override
    public Map tijiao2(FoodsEnt2 fe) {
        Map map = new HashMap();
        if(StringUtils.isEmpty(fe.getId())){
            fe.setStatu(1);
            mongoTemplate.save(fe);
            map.put("code",200);
            map.put("message","添加成功");
        }else{
            mongoTemplate.save(fe);
            map.put("code",201);
            map.put("message","修改成功");
        }
        return map;
    }

    //回显
    @Override
    public FoodsEnt2 backSee2(String id) {
        return mongoTemplate.findById(id,FoodsEnt2.class);
    }

    //组合删除
    @Override
    public void delAll2(String[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            Query query = new Query();
            query.addCriteria(Criteria.where("id").is(arr[i]));
            mongoTemplate.remove(query,FoodsEnt2.class);
        }

    }





}
