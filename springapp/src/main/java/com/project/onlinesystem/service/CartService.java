package com.project.onlinesystem.service;

import com.project.onlinesystem.model.Cart;
import java.util.List;

public interface CartService {
    public Cart saveCart(Cart cart);
    public List<Cart> getAllCart(String userid);
    public void delete(Integer id);
    public Cart get(Integer id);
}
