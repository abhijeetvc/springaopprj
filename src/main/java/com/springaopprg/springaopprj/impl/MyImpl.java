package com.springaopprg.springaopprj.impl;

import com.springaopprg.springaopprj.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {

    @Override
    public String checkData() {
        System.out.println("Checking AOP...");
        return "Hello Spring AOP";
    }
}
