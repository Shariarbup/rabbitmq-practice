package com.example.orderservice.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
