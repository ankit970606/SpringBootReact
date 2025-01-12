package org.kit.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static Logger logger = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* org.kit.springbootrest.service.JobService.*(..)) && args(postId)")
    public Object validationAndUpdate(ProceedingJoinPoint joinPoint,int postId) throws Throwable {

        if(postId<0){
            logger.info("Post ID was Negative, So updating it");
            postId=-postId;
            logger.info("new value of postId = "+postId);
        }
       Object obj= joinPoint.proceed(new Object[]{postId});
        return obj;
    }


}
