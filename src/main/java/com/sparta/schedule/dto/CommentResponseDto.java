package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Comment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentResponseDto {

    private Long id;
    private String content;
    private String username;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public CommentResponseDto(Comment comment) {
    }
}
