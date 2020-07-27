package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long id);

    public Employee createEmployee(Employee newEmployee);

    public Employee updateEmployee(Employee newEmployee, Long id);

    public void deleteEmployee(Long id);
}
