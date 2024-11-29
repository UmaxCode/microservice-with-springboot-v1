package com.umaxcode.user_service.service;

import com.umaxcode.user_service.client.DepartmentClient;
import com.umaxcode.user_service.dto.Department;
import com.umaxcode.user_service.dto.UserAndDepartmentResponse;
import com.umaxcode.user_service.entity.User;
import com.umaxcode.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final DepartmentClient departmentClient;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserAndDepartmentResponse getUserWithDepartment(Long userId) {

        User user = userRepository.findById(userId).orElseThrow();

        Department department = departmentClient.getDepartment(userId);

        return UserAndDepartmentResponse.builder()
                .user(user)
                .department(department)
                .build();
    }
}
