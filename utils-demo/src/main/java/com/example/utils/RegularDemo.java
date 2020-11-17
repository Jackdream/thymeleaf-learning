package com.example.utils;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo {

    public static void main(String[] args) throws IOException {
        String data = IOUtils.toString(new ClassPathResource("data/input.txt").getInputStream(), Charset.defaultCharset());
        List<String> ls=new ArrayList<String>();
        Pattern pattern = Pattern.compile("E.*\"");
        Matcher matcher = pattern.matcher(data);
        while(matcher.find())
            ls.add(matcher.group() + "\n");
        System.out.println(ls);
    }
}
