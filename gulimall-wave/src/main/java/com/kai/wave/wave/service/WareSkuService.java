package com.kai.wave.wave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.wave.wave.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:24:13
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

