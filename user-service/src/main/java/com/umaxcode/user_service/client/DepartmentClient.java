package com.umaxcode.user_service.client;

import com.umaxcode.user_service.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "department-service", path = "/departments")
public interface DepartmentClient {

    @GetMapping(value = "/{id}")
    Department getDepartment(@PathVariable Long id);

}
