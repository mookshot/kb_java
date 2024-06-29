package com.kb.shop.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Order id    -> order domain에 코드 추가
    // OrderItem id -> orderitem domain에 코드 추가

    // shippingStatus
    private String shippingStatus;




}
