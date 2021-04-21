package com.javabeans.io.shoppingservice.controllers;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping")
public class ShoppingControllers {

    private final DiscoveryClient discoveryClient;

    public ShoppingControllers(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping
    public String getUrl() {
        return "Hello";
    }
}
