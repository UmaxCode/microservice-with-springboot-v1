package com.umaxcode.department_service.controller;

import com.umaxcode.department_service.entity.Department;
import com.umaxcode.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/{id}")
    public Department getDepartment(@PathVariable Long id) {

        return departmentService.findDepartmentById(id);
    }
}
