package org.kit.springbootrest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {
    private static Logger logger = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* org.kit.springbootrest.service.JobService.*(..))")
    public Object monitorTme(ProceedingJoinPoint joinPoint) throws Throwable {

        long start=System.currentTimeMillis();

        Object obj=joinPoint.proceed();

        long end = System.currentTimeMillis();
        logger.info("Time taken by " +  joinPoint.getSignature().getName() +" :" + (end-start) + " ms");
        return obj;

    }
}
