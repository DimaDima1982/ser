package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneRestController {

    @RequestMapping("/SomeUrl")
    String doResp(){
        return "all done";
    }

    @PostMapping("/doIt")
    public String doRest(){
        return "wtfRESTdoesntWork";
    }
}
