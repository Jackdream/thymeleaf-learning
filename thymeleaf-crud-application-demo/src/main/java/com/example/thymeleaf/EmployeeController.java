package com.example.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping
    public String getAllEmployees(Model model)
    {
        List<EmployeeEntity> list = service.getAllEmployees();

        model.addAttribute("employees", list);
        return "list-employees";
    }
}
