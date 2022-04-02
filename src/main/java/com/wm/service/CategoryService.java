package com.wm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wm.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);

}
