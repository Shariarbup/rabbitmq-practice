package com.example.customerservice.service;


import com.example.customerservice.configuration.CustomerRabbitmqConfig;
import com.example.customerservice.model.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

//    public void sendInformationToOrderService(User user){
//        rabbitTemplate.convertAndSend(CustomerRabbitmqConfig.EXCHANGE, CustomerRabbitmqConfig.ROUTING_KEY_2, user);
//
//    }
}
