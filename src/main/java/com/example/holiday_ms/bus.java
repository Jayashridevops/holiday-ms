package com.example.holiday_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {

    @GetMapping("/bus")
    public String getData() {
        return  "Please book your bus ticket from yatra app on 75% discount" ;
    }
}