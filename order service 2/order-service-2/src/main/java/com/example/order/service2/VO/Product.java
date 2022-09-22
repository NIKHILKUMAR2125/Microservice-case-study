package com.example.order.service2.VO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {
    private Long product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_qty")
    private String product_qty;

    @Column(name = "product_cost")
    private Long product_cost;
}
