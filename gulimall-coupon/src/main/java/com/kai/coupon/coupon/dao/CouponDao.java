package com.kai.coupon.coupon.dao;

import com.kai.coupon.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:09:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
