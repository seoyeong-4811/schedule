package com.sparta.schedule.dto;

import com.sparta.schedule.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ScheduleRequestDto {

    @NotBlank(message = "할일 제목은 필수입니다.")
    @Size(max = 10, message = "할일 제목은 10자 이내여야 합니다.")
    private String title;

    @NotBlank(message = "할일 내용은 필수입니다.")
    private String content;

    // 유저 ID 목록 (유저와 N:M 관계이므로 여러 유저를 추가할 수 있음)
    private List<Long> userIds;

    public Long getUserId() {
        return 0L;
    }

    public User getDescription() {
        return null;
    }
}
