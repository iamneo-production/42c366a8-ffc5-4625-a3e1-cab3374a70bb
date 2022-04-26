package com.project.onlinesystem.service;

import com.project.onlinesystem.model.Orders;
import com.project.onlinesystem.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders saveOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public List<Orders> getOrders(String userid) {
        return ordersRepository.findByUserid(userid);
    }
    @Override
    public void delete(Integer id){
        ordersRepository.deleteById(id);
    }
     @Override
    public List<Orders> getAllOrderss() {
        return ordersRepository.findAll();
    }
}