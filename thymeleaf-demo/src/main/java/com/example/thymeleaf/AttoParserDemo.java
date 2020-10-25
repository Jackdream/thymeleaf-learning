package com.example.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.attoparser.AbstractChainedMarkupHandler;
import org.attoparser.IMarkupHandler;
import org.attoparser.MarkupParser;
import org.attoparser.ParseException;
import org.attoparser.config.ParseConfiguration;
import org.attoparser.output.OutputMarkupHandler;
import org.attoparser.simple.SimpleMarkupParser;

import java.io.*;

@Slf4j
public class AttoParserDemo {

    public static void main(String[] args) throws ParseException, IOException {

        InputStream stream = AttoParserDemo.class.getResourceAsStream("/templates/home.html");

        StringWriter writer = new StringWriter();

        OutputMarkupHandler outputMarkupHandler = new OutputMarkupHandler(writer);
//        SimpleMarkupParser simpleMarkupParser = new SimpleMarkupParser(ParseConfiguration.htmlConfiguration());
        MarkupParser markupParser = new MarkupParser(ParseConfiguration.htmlConfiguration());
        markupParser.parse(new InputStreamReader(stream), outputMarkupHandler);

        log.info(writer.toString());
    }
}
