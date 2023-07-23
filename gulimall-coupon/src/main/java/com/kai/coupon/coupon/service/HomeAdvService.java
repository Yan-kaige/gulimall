package com.kai.coupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.coupon.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:09:30
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

