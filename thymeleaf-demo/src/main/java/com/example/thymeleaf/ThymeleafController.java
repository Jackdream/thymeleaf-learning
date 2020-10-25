package com.example.thymeleaf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThymeleafController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/getModelAndView")
    public ModelAndView getModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("home", "hi");
        return modelAndView;
    }
}
