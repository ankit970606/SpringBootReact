package org.kit.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    //return type,class name.method name (args)
     //WE CAN GIVE * TO CALL ALL THE MESSAGE
    //@Before("execution(* org.kit.springbootrest.service.JobService.*(..))")//For all method
    // @Before("execution(* org.kit.springbootrest.service.JobService.updateJobPost(..))")   FOR ONE METHOD 
  //  @Before("execution(* org.kit.springbootrest.service.JobService.updateJobPost(..))||execution(* org.kit.springbootrest.service.JobService.getJob(..))")  //FOR TWO METHOD OR MOER SPECIFIC METHOD BEFORE 
    @Before("execution(* org.kit.springbootrest.service.JobService.*(..))") //FOR ALL METHOD
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Method Call "+ joinPoint.getSignature().getName());
    }


    @After("execution(* org.kit.springbootrest.service.JobService.updateJobPost(..))||execution(* org.kit.springbootrest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint joinPoint) {
        logger.info("Method Executed "+ joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* org.kit.springbootrest.service.JobService.updateJobPost(..))||execution(* org.kit.springbootrest.service.JobService.getJob(..))")
    public void logMethodCrash(JoinPoint joinPoint) {
        logger.info("Method Has Some Issue "+ joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* org.kit.springbootrest.service.JobService.updateJobPost(..))||execution(* org.kit.springbootrest.service.JobService.getJob(..))")
    public void logMethodReturn(JoinPoint joinPoint) {
        logger.info("Method Return Successful "+ joinPoint.getSignature().getName());
    }
}
