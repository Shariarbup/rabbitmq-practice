package com.example.orderservice.configuration;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceRabbitmqConfig {

    public static final String QUEUE = "customer_order_service_queue";

    public static final String QUEUE_2 = "user_order_service_queue";

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }
}
