package com.project.onlinesystem.service;

import com.project.onlinesystem.model.Cart;
import com.project.onlinesystem.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCart(String userid) {
        return cartRepository.findByUserid(userid);
    }
    @Override
    public void delete(Integer id){
        cartRepository.deleteById(id);
    }
    
     @Override
    public Cart get(Integer id) {
        return cartRepository.findById(id).get();
    }

}
