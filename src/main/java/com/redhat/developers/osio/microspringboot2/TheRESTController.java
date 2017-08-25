package com.redhat.developers.osio.microspringboot2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TheRESTController {

    @Autowired
    OrdersService ordersService;

    @RequestMapping(value = "/api/customer")
    public String getCustomers() {
        return "C200,C201,C203";
    }

    @RequestMapping(value = "/api/customer/orders", method = RequestMethod.POST)
    public String getCustomerOrders(@RequestBody String customers) {
        log.info("* Finding orders for customers {}", customers);
        return String.format("Orders for Customers %s is %s ", ordersService.getOrders(customers));
    }


}