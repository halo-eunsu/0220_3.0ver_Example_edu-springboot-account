package com.nhn.edu.springboot.account.management;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class MyHealthIndecator implements HealthIndicator {

    private final AtomicBoolean healthy = new AtomicBoolean(true);

    public void setUnhealthy(){
        this.healthy.set(false);
    }


    @Override
    public Health health() {
        if(healthy.get()){
            return Health.up().build();
        }
        return Health.down().withDetail("reason", "manual unhealthy status...").build();
    }
}
