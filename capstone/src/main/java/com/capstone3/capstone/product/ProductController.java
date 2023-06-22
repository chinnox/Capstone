package com.capstone3.capstone.product;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List> fetchAllProduct(){
        return ResponseEntity.ok(productService.fetchAllProduct());
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Optional> fetchById(@PathVariable Long productId){
        return ResponseEntity.ok(productService.fetchById(productId));
    }

    @PostMapping("/product/register")
    public ResponseEntity<Product> register(@RequestBody Product request){
        return ResponseEntity.ok(productService.register(request));
    }

    @GetMapping("/sample-demo")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("it works");
    }
}
