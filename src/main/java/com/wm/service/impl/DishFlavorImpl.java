package com.wm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wm.entity.DishFlavor;
import com.wm.mapper.DishFlavorMapper;
import com.wm.service.DishFlavorService;
import com.wm.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
