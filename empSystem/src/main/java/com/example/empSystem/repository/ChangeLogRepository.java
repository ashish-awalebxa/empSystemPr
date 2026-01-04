package com.example.empSystem.repository;

import com.example.empSystem.entity.ChangeLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeLogRepository extends JpaRepository<ChangeLog, Long> {
}
