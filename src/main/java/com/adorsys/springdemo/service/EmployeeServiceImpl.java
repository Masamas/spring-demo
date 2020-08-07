package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.Employee;
import com.adorsys.springdemo.exception.CustomException;
import com.adorsys.springdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElseThrow(() -> new CustomException("Employee not found: " + id));
    }

    @Override
    public Employee createEmployee(Employee newEmployee) {
        return repo.save(newEmployee);
    }

    @Override
    public Employee updateEmployee(Employee newEmployee, Long id) {
        return repo.findById(id).map(oldEmployee -> {
            oldEmployee.setName(newEmployee.getName());
            oldEmployee.setCity(newEmployee.getCity());
            oldEmployee.setHobby(newEmployee.getHobby());
            return repo.save(oldEmployee);
        }).orElseGet(() -> {
            newEmployee.setId(id);
            return repo.save(newEmployee);
        });
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
