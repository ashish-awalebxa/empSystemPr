package com.example.empSystem.service;

import com.example.empSystem.controller.dto.EmployeeResponse;
import com.example.empSystem.entity.Employee;
import com.example.empSystem.repository.EmployeeRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeResponse getMyDetails() {

        String username = SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();

        Employee employee = employeeRepository
                .findByUserUsername(username)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        return new EmployeeResponse(
                employee.getId(),
                employee.getUser().getUsername(),
                employee.getDepartment(),
                employee.isActive()
        );
    }
}
