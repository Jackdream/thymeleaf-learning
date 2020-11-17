package com.example.scenes.aopannotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Method {

    @MethodAnnotation
    public void method(){
        log.info("interfaceLog");
    }
}
