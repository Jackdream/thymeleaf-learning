package com.example.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.EngineContext;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class Demo {

    public static void main(String[] args) throws IOException {
        InputStream stream = Demo.class.getResourceAsStream("/templates/home.html");
        String result = IOUtils.toString(stream, "UTF-8");
        log.info(result);

        TemplateEngine templateEngine = new TemplateEngine();

        StringTemplateResolver resolver = new StringTemplateResolver();
        resolver.setTemplateMode(TemplateMode.HTML);

        templateEngine.addTemplateResolver(resolver);
        EngineContext engineContext = new EngineContext();

        templateEngine.process()

    }
}
