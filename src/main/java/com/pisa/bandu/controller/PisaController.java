package com.pisa.bandu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PisaController {

    @GetMapping("/status")
    public String getPisaStatus(){
        return "I am alive";
    }

    @GetMapping("/newfeature")
    public String getPStatus(){
        return "new feature";
    }
}
