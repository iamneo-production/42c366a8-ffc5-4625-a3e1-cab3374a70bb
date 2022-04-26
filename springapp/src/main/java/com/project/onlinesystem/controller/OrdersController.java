package com.project.onlinesystem.controller;

import com.project.onlinesystem.model.Orders;
import com.project.onlinesystem.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("/add")
    public String add(@RequestBody Orders orders){
        ordersService.saveOrders(orders);
        return "New orders is added";
    }

    @GetMapping("/getAll/{userid}")
    public List<Orders> list(@PathVariable String userid){
        return ordersService.getOrders(userid);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        ordersService.delete(id);
        return "Deleted Orders with id "+id;
    }   

    @GetMapping("/getAll")
    public List<Orders> list(){
        return ordersService.getAllOrderss();
    }
}
