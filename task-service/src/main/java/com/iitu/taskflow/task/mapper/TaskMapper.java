package com.iitu.taskflow.task.mapper;

import com.iitu.taskflow.task.dto.TaskRequestDTO;
import com.iitu.taskflow.task.dto.TaskResponseDTO;
import com.iitu.taskflow.task.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public Task toEntity(TaskRequestDTO dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        task.setPriority(dto.getPriority());
        task.setDueDate(dto.getDueDate());
        task.setProjectId(dto.getProjectId());
        task.setAssignedUserId(dto.getAssignedUserId());
        return task;
    }

    public void updateEntityFromDto(TaskRequestDTO dto, Task task) {
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        task.setPriority(dto.getPriority());
        task.setDueDate(dto.getDueDate());
        task.setProjectId(dto.getProjectId());
        task.setAssignedUserId(dto.getAssignedUserId());
    }

    public TaskResponseDTO toDto(Task task) {
        TaskResponseDTO dto = new TaskResponseDTO();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setPriority(task.getPriority());
        dto.setDueDate(task.getDueDate());
        dto.setCreatedAt(task.getCreatedAt());
        dto.setUpdatedAt(task.getUpdatedAt());
        dto.setProjectId(task.getProjectId());
        dto.setAssignedUserId(task.getAssignedUserId());
        
        // Эти поля будут заполняться сервисом при необходимости
        dto.setAssignedUserName(null);
        dto.setProjectName(null);
        
        return dto;
    }
} 