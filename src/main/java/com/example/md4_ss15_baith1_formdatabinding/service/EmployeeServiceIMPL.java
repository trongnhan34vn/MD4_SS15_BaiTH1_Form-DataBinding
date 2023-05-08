package com.example.md4_ss15_baith1_formdatabinding.service;

import com.example.md4_ss15_baith1_formdatabinding.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceIMPL implements IEmployeeService{
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("SV001", "Nam béo", "0965432178"));
        employeeList.add(new Employee("SV002", "Khoa pug", "0965432178"));
        employeeList.add(new Employee("SV003", "Con vợ Hoàng Anh", "0965432178"));
    }
    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }
}
