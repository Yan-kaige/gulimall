package com.kai.order.order.dao;

import com.kai.order.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author kaige
 * @email sunlightcs@gmail.com
 * @date 2023-07-22 16:20:13
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
