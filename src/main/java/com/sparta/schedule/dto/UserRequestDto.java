package com.sparta.schedule.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    @NotBlank(message = "유저명은 필수입니다.")
    @Size(max = 4, message = "유저명은 4자 이내여야 합니다.")
    private String username;

    @NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "이메일 형식이 아닙니다.")
    private String email;
}
