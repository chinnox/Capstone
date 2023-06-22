package com.capstone3.capstone.product;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Long productId;
    private String product;
    private String title;
    private String description;
    private Double price;
    private String img;
    private Integer quantity;

    public Product(String product,
                   String title,
                   String description,
                   Double price,
                   String img,
                   Integer quantity) {
        this.product = product;
        this.title = title;
        this.description = description;
        this.price = price;
        this.img = img;
        this.quantity = quantity;
    }
}
