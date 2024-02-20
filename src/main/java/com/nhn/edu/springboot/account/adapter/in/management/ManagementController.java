package com.nhn.edu.springboot.account.adapter.in.management;


import com.nhn.edu.springboot.account.management.MyHealthIndecator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManagementController {

    private MyHealthIndecator myHealthIndicator;

    @PostMapping("/management/fail")
    public String setFail() {
        myHealthIndicator.setUnhealthy();
        return "OK";
    }


}
