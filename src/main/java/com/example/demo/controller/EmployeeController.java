package com.example.demo.controller;

import com.example.demo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class EmployeeController {


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> listemployee = Arrays.asList(
          new Employee(1, "1st", "last name"),
          new Employee(2, "first name", "last name")
        );
        model.addAttribute("listemployee", listemployee);

        return "index";
    }

    @RequestMapping(value = "/new")
    public String add(Model model) {
        model.addAttribute("employee", new Employee());

        return "new_employee";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());

        return "new_employee";
    }

}