package com.example.tmp.service.implementation;

import com.example.tmp.domain.Product;
import com.example.tmp.repository.ProductRepository;
import com.example.tmp.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplm implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImplm(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findByRef(String ref) {
        return productRepository.findByRef(ref);
    }
}
