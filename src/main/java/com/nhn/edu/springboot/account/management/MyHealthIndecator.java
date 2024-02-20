package com.nhn.edu.springboot.account.management;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class MyHealthIndecator implements HealthIndicator {

    private final AtomicBoolean healthy = new AtomicBoolean(true);
//
//    @Override
//    public Health getHealth(boolean includeDetails) {
//        return HealthIndicator.super.getHealth(includeDetails);
//    }



    @Override
    public Health health() {
        return Health.up().withDetail("reason", "don't know").build();

    }
}
