package com.kai.coupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.coupon.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:09:30
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

