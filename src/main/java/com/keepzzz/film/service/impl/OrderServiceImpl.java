package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Orders;
import com.keepzzz.film.mapper.OrderMapper;
import com.keepzzz.film.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Orders> getOrders() {
        return orderMapper.getOrders();
    }

    @Override
    public Orders getOrderByOrderId(Long id) {
        return orderMapper.getOrderByOrderId(id);
    }

    @Override
    public Orders getOrderByUserId(Long userId) {
        return orderMapper.getOrderByUserId(userId);
    }

    @Override
    public boolean insert(Orders orders) {
        return orderMapper.insert(orders) > 0;
    }

    @Override
    public boolean update(Orders orders) {
        return orderMapper.update(orders) > 0;
    }
}
