package com.example.utils;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class UtilsController {

    @RequestMapping("/regular")
    public List<String> regular(@RequestBody String data){
        List<String> ls=new ArrayList<String>();
        Pattern pattern = Pattern.compile("E.*\"");
        Matcher matcher = pattern.matcher(data);
        while(matcher.find())
            ls.add(matcher.group() + "\n");
        return ls;
    }
}
