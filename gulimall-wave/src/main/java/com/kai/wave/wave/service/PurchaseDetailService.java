package com.kai.wave.wave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.wave.wave.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:24:13
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

