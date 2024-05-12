package com.example.orderservice.service;

import com.example.orderservice.configuration.OrderServiceRabbitmqConfig;
import com.example.orderservice.model.Customer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class OrderServiceConsumer {

    @RabbitListener(queues = OrderServiceRabbitmqConfig.QUEUE)
    public void consumeCustomerOrderServiceQueue(Customer customer) {
        System.out.println("Customer message: " + customer.toString());
    }

//    @RabbitListener(queues = OrderServiceRabbitmqConfig.QUEUE_2)
//    public void consumeUserFromOrderService(User user) {
//        System.out.println("User message: " + user.toString());
//    }
}
