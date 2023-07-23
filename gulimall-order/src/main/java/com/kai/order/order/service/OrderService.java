package com.kai.order.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kai.common.utils.PageUtils;
import com.kai.order.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:20:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

