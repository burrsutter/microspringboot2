package com.redhat.developers.osio.microspringboot2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orders", url = "${microspringboot2.orders_url}",
        fallback = OrdersService.OrdersServiceFallback.class)
public interface OrdersService {

    @RequestMapping(path = "/api/orders", method = RequestMethod.POST)
    String getOrders(String customers);


    @Component
    class OrdersServiceFallback implements OrdersService {

        public String getOrders(String customers) {
            return "F997,F998,F999";
        }
    }
}
