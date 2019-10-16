package com.keepzzz.film.service;

import com.keepzzz.film.domain.OrderDetail;
import com.keepzzz.film.provider.OrderDetailProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderDetailService {


    /**
     * 查询所有订单详情
     * @return
     */
    List<OrderDetail> getOrderDetails();

    /**
     * 查询单个订单详情
     * @param id
     * @return
     */

    OrderDetail getOrderDetail(long id);

    /**
     * 根据订单id来查询单个详情
     * @param orderId
     * @return
     */
    OrderDetail getOrderDetailByOrderId(long orderId);

    /**
     * 添加订单详情
     * @param orderDetail
     * @return
     */

    boolean insert(OrderDetail orderDetail);

    /**
     * 修改订单详情
     * @param orderDetail
     * @return
     */

    boolean update(OrderDetail orderDetail);
}
