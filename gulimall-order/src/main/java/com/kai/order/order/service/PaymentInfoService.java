package com.kai.order.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.order.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:20:13
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

