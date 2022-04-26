package com.project.onlinesystem.service;

import com.project.onlinesystem.model.Product;
import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product get(Integer id);
    public void delete(Integer id);
}
