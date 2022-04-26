package com.project.onlinesystem.service;

import com.project.onlinesystem.model.Orders;
import java.util.List;

public interface OrdersService {
    public Orders saveOrders(Orders orders);
    public List<Orders> getOrders(String userid);
    public List<Orders> getAllOrderss();
    public void delete(Integer id);
}
