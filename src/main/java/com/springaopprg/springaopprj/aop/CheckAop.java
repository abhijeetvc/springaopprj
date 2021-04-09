package com.springaopprg.springaopprj.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckAop {

    @Before("execution (* com.springaopprg.springaopprj.impl.MyImpl.checkData())")
    public void checkAopExecution(){
        System.out.println("After advice executed...");
        
    }
}
