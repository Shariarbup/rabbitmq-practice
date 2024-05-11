package com.example.customerservice.controller;


import com.example.customerservice.configuration.CustomerRabbitmqConfig;
import com.example.customerservice.model.Customer;
import com.example.customerservice.model.User;
import com.example.customerservice.service.CustomerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customerService", method = RequestMethod.POST,
            produces = "application/json", consumes = "application/json")
    public void customerOrderRequest(@RequestBody Customer customer) {
        rabbitTemplate.convertAndSend(CustomerRabbitmqConfig.EXCHANGE, CustomerRabbitmqConfig.ROUTING_KEY, customer);
    }

//    @RequestMapping(value = "/users", method = RequestMethod.POST,
//            produces = "application/json", consumes = "application/json")
//    public void getUserRequest(@RequestBody User user) {
////        customerService.sendInformationToOrderService(user);
//        rabbitTemplate.convertAndSend(CustomerRabbitmqConfig.EXCHANGE, CustomerRabbitmqConfig.ROUTING_KEY_2, user);
//
//    }
}
