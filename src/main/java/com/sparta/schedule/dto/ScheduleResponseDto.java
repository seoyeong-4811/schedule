package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ScheduleResponseDto {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    // 일정에 연관된 유저 정보
    private List<UserResponseDto> users;

    // 댓글 목록
    private List<CommentResponseDto> comments;

    public ScheduleResponseDto(Schedule schedule) {
    }
}

