package com.curvwind.onboarding.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponse {
    private String status;
    private String message;
    private Object errors;
}
