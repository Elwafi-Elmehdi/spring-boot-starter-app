package com.example.tmp.service.facade;

import com.example.tmp.domain.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product save(Product product);
    public Product findByRef(String ref);
}
