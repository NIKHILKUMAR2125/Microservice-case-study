package com.example.product.service2.service;
import com.example.product.service2.repository.ProductRepository;
import com.example.product.service2.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product prod)
    {return productRepository.save(prod);}

public Optional<Product> findByProdId(Long product_id){
    return productRepository.findById(product_id);
}
}