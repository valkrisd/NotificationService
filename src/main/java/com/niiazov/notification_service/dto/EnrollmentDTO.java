package com.niiazov.notification_service.dto;

import com.niiazov.notification_service.enums.EnrollmentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EnrollmentDTO {

    @NotNull(message = "User ID cannot be null")
    private Integer userId;

    private EnrollmentStatus status;

    private LocalDate enrollmentDate;

    private Boolean completed;

    private CourseDTO courseDTO;
}

