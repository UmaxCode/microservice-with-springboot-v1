package com.umaxcode.user_service.dto;

import com.umaxcode.user_service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAndDepartmentResponse {

    private User user;
    private Department department;
}
