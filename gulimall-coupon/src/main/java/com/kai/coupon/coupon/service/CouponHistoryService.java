package com.kai.coupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.coupon.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:09:30
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

