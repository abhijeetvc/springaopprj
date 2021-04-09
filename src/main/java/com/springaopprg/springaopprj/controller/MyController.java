package com.springaopprg.springaopprj.controller;

import com.springaopprg.springaopprj.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping("/checkaop")
    public String checkAop(){
        return myImpl.checkData();
    }
}
