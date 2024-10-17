package com.sparta.schedule.dto;

import com.sparta.schedule.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponseDto {

    private Long id;
    private String username;
    private String email;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public UserResponseDto(User user) {
    }
}