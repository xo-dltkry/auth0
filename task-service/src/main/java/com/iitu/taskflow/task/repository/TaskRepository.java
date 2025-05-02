package com.iitu.taskflow.task.repository;

import com.iitu.taskflow.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Базовые CRUD операции наследуются от JpaRepository
} 