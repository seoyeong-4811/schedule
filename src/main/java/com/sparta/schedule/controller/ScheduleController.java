package com.sparta.schedule.controller;

import com.sparta.schedule.dto.ScheduleRequestDto;
import com.sparta.schedule.dto.ScheduleResponseDto;
import com.sparta.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
@Validated
public class ScheduleController {

    private final ScheduleService scheduleService;

    // 일정 생성
    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody @Valid ScheduleRequestDto requestDto) {
        ScheduleResponseDto createdSchedule = scheduleService.createSchedule(requestDto);
        return ResponseEntity.ok(createdSchedule);
    }

    // 모든 일정 조회
    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> getAllSchedules() {
        List<ScheduleResponseDto> schedules = scheduleService.getAllSchedules();
        return ResponseEntity.ok(schedules);
    }

    // 특정 일정 조회
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> getScheduleById(@PathVariable Long id) {
        ScheduleResponseDto schedule = scheduleService.getScheduleById(id);
        return ResponseEntity.ok(schedule);
    }

    // 일정 수정
    @PutMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> updateSchedule(@PathVariable Long id, @RequestBody @Valid ScheduleRequestDto requestDTO) {
        ScheduleResponseDto updatedSchedule = scheduleService.updateSchedule(id, requestDTO);
        return ResponseEntity.ok(updatedSchedule);
    }

    // 일정 삭제 (댓글도 함께 삭제)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}