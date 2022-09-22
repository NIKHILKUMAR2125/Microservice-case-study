package com.example.order.service2.service;

import com.example.order.service2.VO.Customer;
import com.example.order.service2.VO.Product;
import com.example.order.service2.VO.ResponseTemplate;
import com.example.order.service2.entity.Order;
import com.example.order.service2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Component

public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Order saveOrder(Order order) {return orderRepository.save(order);}

    public ResponseTemplate getOrderWithProductCustomer(Long orderId) {
        ResponseTemplate rtVO = new ResponseTemplate();
        Order order = orderRepository.findByOrderId(orderId);
        Product product = restTemplate.getForObject("http://product-service-2/products/"+order.getProduct_id(),Product.class);
        Customer customer = restTemplate.getForObject("http://customer-service-2/customers/"+order.getCustomer_id(),Customer.class);
        rtVO.setOrder(order);
        rtVO.setProduct(product);
        rtVO.setCustomer(customer);
        return rtVO;
    }


}
