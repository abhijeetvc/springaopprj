package com.springaopprg.springaopprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringaopprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaopprjApplication.class, args);
	}

}

// Aspect : It is a cross-cutting concern
// PointCut: It is scenario that matches the JoinPoint
// JoinPoint: It is point that represents execution of method
// Advice: It is action taken by the aspect : 5 types -> After, Before, AfterReturning, Around, AfterThrowing