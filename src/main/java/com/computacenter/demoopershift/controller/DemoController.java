package com.computacenter.demoopershift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/")
    public String Home(){
        return "Welcome to the demo of openshift";
    }
}
