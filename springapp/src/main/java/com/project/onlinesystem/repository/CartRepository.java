package com.project.onlinesystem.repository;

import com.project.onlinesystem.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CartRepository  extends JpaRepository<Cart,Integer>{
    List<Cart> findByUserid(String userid);
}
