package com.example.scenes.aopannotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MethodAspectJ {

    @Pointcut("@annotation(com.example.scenes.aopannotation.MethodAnnotation)")
    public void methodAnnotation(){

    }

    @Before("methodAnnotation()")
    public void methodAnnotationBefore(){
        log.info("method before");
    }
}
