package com.kai.coupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.coupon.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:09:30
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

