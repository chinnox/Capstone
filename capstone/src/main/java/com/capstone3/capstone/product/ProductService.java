package com.capstone3.capstone.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> fetchAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> fetchById(Long productId){
        return productRepository.findById(productId);
    }

    public Product register(Product product){
        return productRepository.save(product);
    }
}
