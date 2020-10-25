package com.example.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class ThymeleafDemo {

    public static void main(String[] args) throws IOException {
//        InputStream stream = ThymeleafDemo.class.getResourceAsStream("/templates/home.html");
//        String result = IOUtils.toString(stream, "UTF-8");
//        log.info(result);
//       StringTemplateResolver resolver = new StringTemplateResolver();

        TemplateEngine templateEngine = new TemplateEngine();

        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        templateEngine.addTemplateResolver(resolver);

        Context context = new Context();
        context.setVariable("home", "hi");

        String result = result = templateEngine.process("home.html", context);
        log.info(result);

    }
}
