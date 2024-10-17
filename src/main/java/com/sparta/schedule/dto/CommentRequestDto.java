package com.sparta.schedule.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {

    @NotBlank(message = "댓글 내용은 필수입니다.")
    private String content;

    @NotBlank(message = "작성 유저명은 필수입니다.")
    private String username;

    // 연관된 일정 ID
    private Long scheduleId;
}
