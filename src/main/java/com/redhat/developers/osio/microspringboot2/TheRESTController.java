package com.redhat.developers.osio.microspringboot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRESTController {
    @RequestMapping("/api/customer")
    public String getCustomers() {
        return "C100,C101,C103";
    }

}