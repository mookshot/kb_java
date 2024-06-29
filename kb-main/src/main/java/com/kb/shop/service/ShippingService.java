package com.kb.shop.service;

import com.kb.shop.domain.ShippingInfo;
import com.kb.shop.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ShippingService {

    @Autowired
    ShippingRepository shippingRepository;


    public ShippingInfo getShippingInfo(Long id){
        return shippingRepository.selectShippingInfo(id);
    }

    public void deleteShippingInfo(Long id){shippingRepository.deleteShippingInfo(id);}


   public ShippingInfo setShippingInfo (ShippingInfo shippingInfo){
        shippingRepository.setShippinginfo((shippingInfo));
        return shippingRepository.selectSelectInfoByShippingStatus(shippingInfo.getShippingStatus());
        // 과제에 특정조건을 명시 안해주셔서... 상태로 가져오는것으로 했음.


   }
}
