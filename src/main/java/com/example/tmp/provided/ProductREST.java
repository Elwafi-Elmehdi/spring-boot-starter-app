package com.example.tmp.provided;

import com.example.tmp.domain.Product;
import com.example.tmp.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductREST {
    private ProductService productService;

    @Autowired
    public ProductREST(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/")
    public List<Product> findAll() {
        return productService.findAll();
    }
    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
    @GetMapping("/ref/{ref}")
    public Product findByRef(@PathVariable  String ref) {
        return productService.findByRef(ref);
    }
}
