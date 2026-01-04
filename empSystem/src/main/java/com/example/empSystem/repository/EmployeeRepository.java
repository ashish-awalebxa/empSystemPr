package com.example.empSystem.repository;

import com.example.empSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByUserUsername(String username);

    List<Employee> findByIsActive(boolean isActive);
}
