package com.example.empSystem.controller.dto;

public class EmployeeResponse {

    private Long id;
    private String username;
    private String department;
    private boolean active;

    public EmployeeResponse(Long id, String username, String department, boolean active) {
        this.id = id;
        this.username = username;
        this.department = department;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isActive() {
        return active;
    }
}
