package com.kb.shop.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;

    @ManyToOne(fetch = FetchType.LAZY) // 데이터는 실제로 접근할 때 로드됨, 데이터를 접근할 때마다 추가적인 데이터베이스 쿼리가 발생
    @JoinColumn(name = "shippinginfo_id")
    private  ShippingInfo shippingInfo;

    private int quantity;
    private double price;

    public double getTotalPrice() {
        return quantity * price;
    }
}
