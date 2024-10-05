package com.umaxcode.user_service.VO;

import com.umaxcode.user_service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
