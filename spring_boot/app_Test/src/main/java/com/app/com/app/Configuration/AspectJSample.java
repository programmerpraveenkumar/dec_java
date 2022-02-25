package com.app.com.app.Configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//getting the execution time of the method.
@Aspect
@Component
public class AspectJSample {
    //before
    long currentTime;

    //before execution of the User service methods
    @Before(value="execution(* com.app.com.app.Service.UserService.*(..))")
    public void beforeExecution(JoinPoint jp){
        this.currentTime = System.currentTimeMillis();//current time
        System.out.println("This is before method before caling service "+this.currentTime);
    }

    @After(value="execution(* com.app.com.app.Service.UserService.*(..))")
    public void afterExecution(JoinPoint jp){
        System.out.println("Time to taken for exection is "+(System.currentTimeMillis()- this.currentTime) );//current time
        System.out.println("This is after caling service");
    }
}
