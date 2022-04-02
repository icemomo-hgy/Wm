package com.wm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wm.dto.SetmealDto;
import com.wm.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void removeWithDish(List<Long> ids);
}
