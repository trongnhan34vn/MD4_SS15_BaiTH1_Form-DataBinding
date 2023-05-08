package com.example.md4_ss15_baith1_formdatabinding.controller;

import com.example.md4_ss15_baith1_formdatabinding.model.Employee;
import com.example.md4_ss15_baith1_formdatabinding.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/employee"})
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("employee", new Employee());
        return "/employee/create";
    }

    @PostMapping("create")
    public String createNewStudent(@ModelAttribute ("employee") Employee newEmployee, Model model) {
        employeeService.save(newEmployee);
        model.addAttribute("message", "đúng r may quá");
        return "/employee/create";
    }

    @GetMapping
    public String show(Model model) {
        model.addAttribute("list", employeeService.findAll());
        return "/employee/show";
    }
}
