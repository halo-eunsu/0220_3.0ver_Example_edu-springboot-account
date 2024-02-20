package com.nhn.edu.springboot.account.management;

import jakarta.annotation.Nullable;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Endpoint(id="counter")
public class CounterEndpoint {

    private final AtomicLong count = new AtomicLong();

    @ReadOperation
    public long read() {
        return count.get();
    }

    @WriteOperation
    public Long increment(@Nullable Long delta){
        if(delta == null){
            count.incrementAndGet();
        }
        return count.addAndGet(delta);
    }

//    @DeleteOperation
//    public Long reset(){
//        count.set(delta);
//    }

}
