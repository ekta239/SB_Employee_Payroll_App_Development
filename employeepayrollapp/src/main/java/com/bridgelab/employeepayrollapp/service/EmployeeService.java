package com.bridgelab.employeepayrollapp.service;

import com.bridgelab.employeepayrollapp.model.EmployeePayRoll;
import com.bridgelab.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<EmployeePayRoll> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeePayRoll getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayRoll createEmployee(EmployeePayRoll employee) {
        return repository.save(employee);
    }

    public EmployeePayRoll updateEmployee(int id, EmployeePayRoll newEmployee) {
        Optional<EmployeePayRoll> existingEmployee = repository.findById(id);
        if (existingEmployee.isPresent()) {
            EmployeePayRoll employee = existingEmployee.get();
            employee.setName(newEmployee.getName());
            employee.setSalary(newEmployee.getSalary());
            return repository.save(employee);
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
