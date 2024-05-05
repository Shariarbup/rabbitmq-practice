package com.example.customerservice.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRabbitmqConfig {
    public static final String EXCHANGE = "customer_order_service_exchange";
    public static final String ROUTING_KEY = "customer_order_service_routing_key";
    public static final String QUEUE = "customer_order_service_queue";

    @Bean
    public Queue customerOrderQueue() {
        return new Queue(QUEUE);
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingCustomerServiceQueue(TopicExchange exchange) {
        return BindingBuilder.bind(customerOrderQueue()).to(exchange).with(ROUTING_KEY);
    }

}
