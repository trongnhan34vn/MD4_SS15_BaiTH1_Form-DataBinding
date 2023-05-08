package com.example.md4_ss15_baith1_formdatabinding.service;

import com.example.md4_ss15_baith1_formdatabinding.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    void save(Employee employee);
}
