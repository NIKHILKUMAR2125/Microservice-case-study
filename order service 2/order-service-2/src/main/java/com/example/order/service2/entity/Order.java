package com.example.order.service2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "order_number")
    private Long order_number;

    @Column(name = "order_status")
    private String order_status;

    private Long product_id;

    private Long customer_id;
}
