package com.sparta.schedule.entity;

import com.sparta.schedule.dto.Size;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "할일 제목은 필수입니다.")
    @Size(max = 10, message = "할일 제목은 10자 이내여야 합니다.")
    private String title;

    @NotBlank(message = "할일 내용은 필수입니다.")
    private String content;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    // 유저와 N:M 관계
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_schedule",
            joinColumns = @JoinColumn(name = "schedule_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users = new ArrayList<>();

    // 댓글과의 연관관계. 일정 삭제 시 댓글도 함께 삭제됨 (CascadeType.REMOVE)
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    public void setUser(User user) {
    }

    public void setDescription(Object description) {
    }
}
