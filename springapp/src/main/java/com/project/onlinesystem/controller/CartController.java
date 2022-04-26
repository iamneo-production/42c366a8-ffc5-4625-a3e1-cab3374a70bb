package com.project.onlinesystem.controller;

import com.project.onlinesystem.model.Cart;
import com.project.onlinesystem.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public String add(@RequestBody Cart cart){
        cartService.saveCart(cart);
        return "New item is added";
    }

    @GetMapping("/getAll/{userid}")
    public List<Cart> list(@PathVariable String userid){
        return cartService.getAllCart(userid);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        cartService.delete(id);
        return "Deleted cart with id "+id;
    }    

    @PutMapping("/{id}")
    public ResponseEntity<Cart> update(@RequestBody Cart cart,@PathVariable Integer id){
        try{
            cartService.get(id);
            cartService.saveCart(cart);
            return new ResponseEntity<Cart>(cart,HttpStatus.OK);
        }

        catch( NoSuchElementException e){
            return new ResponseEntity<Cart>(HttpStatus.NOT_FOUND);
        }
    }

}
