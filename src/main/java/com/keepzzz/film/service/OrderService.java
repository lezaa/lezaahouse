package com.keepzzz.film.service;

import com.keepzzz.film.domain.Orders;
import com.keepzzz.film.provider.OrdersProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface OrderService {



    /**
     * 查询所有订单
     * @return
     */
    List<Orders> getOrders();

    /**
     * 根据订单id查询单个订单
     * @return
     */
    Orders getOrderByOrderId(Long id);


    /**
     * 根据用户id查询单个订单
     * @return
     */
    Orders getOrderByUserId(Long userId);

    /**
     * 添加订单
     * @param orders
     * @return
     */
    boolean insert(Orders orders);


    /**
     * 更新订单
     */
    boolean update(Orders orders);
}
