package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.OrderDetail;
import com.keepzzz.film.mapper.OrderDetailMapper;
import com.keepzzz.film.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public List<OrderDetail> getOrderDetails() {
        return orderDetailMapper.getOrderDetails();
    }

    @Override
    public OrderDetail getOrderDetail(long id) {
        return orderDetailMapper.getOrderDetail(id);
    }

    @Override
    public OrderDetail getOrderDetailByOrderId(long orderId) {
        return orderDetailMapper.getOrderDetailByOrderId(orderId);
    }

    @Override
    public boolean insert(OrderDetail orderDetail) {
        return orderDetailMapper.insert(orderDetail) > 0;
    }

    @Override
    public boolean update(OrderDetail orderDetail) {
        return orderDetailMapper.update(orderDetail) > 0;
    }
}
