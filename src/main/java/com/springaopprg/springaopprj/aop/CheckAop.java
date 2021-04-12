package com.springaopprg.springaopprj.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckAop {

//    @Before("execution (* com.springaopprg.springaopprj.impl.MyImpl.checkData())")
//    public void checkAopExecution(){
//        System.out.println("After advice executed...");
//
//    }
//
//    @AfterReturning(pointcut = "execution (* com.springaopprg.springaopprj.impl.MyImpl.checkData())",
//            returning = "retValue")
//    public void checkAopExecution(Object retValue){
//        String value= (String) retValue;
//        System.out.println("After advice executed... "+value);
//    }

    @Around("execution (* com.springaopprg.springaopprj.impl.MyImpl.checkData())")
    public Object checkAroundAdvice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before Advice execution..");
        Object returnData=jp.proceed();
        System.out.println("After Advice execution..");
        return returnData;
    }
}
