package com.example.userservice.service;

import com.example.userservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "DEPARTMENT-SERVICE", url = "http://localhost:8080")
public interface APIClient {

    @GetMapping(value = "/api/departments/{id}")
    public DepartmentDto getDepartmentById(@PathVariable("id") Long departmentId);
}
