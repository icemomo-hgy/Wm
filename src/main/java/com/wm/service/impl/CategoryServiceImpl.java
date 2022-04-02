package com.wm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wm.common.CustomException;
import com.wm.entity.Category;
import com.wm.entity.Dish;
import com.wm.entity.Setmeal;
import com.wm.mapper.CategoryMapper;
import com.wm.service.CategoryService;
import com.wm.service.DishService;
import com.wm.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;
    @Override
    public void remove(Long id){
        //根据id 查询菜品数据
        LambdaQueryWrapper<Dish> wrapper = new LambdaQueryWrapper<Dish>();
        wrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(wrapper);
        //如果count大于0，已经关联，抛出一个业务异常
        if(count > 0 ){
            throw new CustomException("当前分类下关联了菜品，不能删除");  // 抛出一个业务异常

        }
        //查询是否关联了菜单
        LambdaQueryWrapper<Setmeal> wrapper2 = new LambdaQueryWrapper<>();
        wrapper2.eq(Setmeal::getCategoryId,id);
        int count1 = setmealService.count(wrapper2);
        if(count1 > 0){
            throw new CustomException("当前分类下关联了套餐，不能删除");

        }
        super.removeById(id);
    }
}
