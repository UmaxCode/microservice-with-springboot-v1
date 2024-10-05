package com.umaxcode.user_service.service;

import com.umaxcode.user_service.VO.Department;
import com.umaxcode.user_service.VO.ResponseTemplateVO;
import com.umaxcode.user_service.entity.User;
import com.umaxcode.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {

        User user = userRepository.findById(userId).orElseThrow();

        ResponseTemplateVO vo = ResponseTemplateVO.builder()
                .user(user)
                .build();

        Department response = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"
                + user.getDepartmentId(), Department.class);

        vo.setDepartment(response);
        return vo;
    }
}
