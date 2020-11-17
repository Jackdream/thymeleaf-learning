package com.example.scenes.aopannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements CommandLineRunner {

    @Autowired
    Method method;

    @Override
    public void run(String... args) throws Exception {
        method.method();
    }
}
