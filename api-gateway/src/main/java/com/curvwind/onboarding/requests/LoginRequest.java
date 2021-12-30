package com.curvwind.onboarding.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Builder
@Data
public class LoginRequest {
    @NotEmpty
    @Size(min = 2, message = "username should have at least 2 characters")
    public String userName;

    @NotEmpty
    public String password;
}
