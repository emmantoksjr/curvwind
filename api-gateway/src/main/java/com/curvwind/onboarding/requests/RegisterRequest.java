package com.curvwind.onboarding.requests;

import com.curvwind.onboarding.requests.customRules.PlatformType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotEmpty
    @Size(min = 2, message = "username should have at least 2 characters")
    public String userName;

    @NotEmpty
    @Email
    public String email;

    @NotEmpty
    @Size(min = 8, message = "password should have at least 8 characters")
    public String phone;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate dob;

    @NotEmpty
    @URL
    @Size(min = 2, message = "callback url should have at least 2 characters")
    public String callbackUrl;

    @NotEmpty
    @PlatformType
    public String platform;

    @NotEmpty
    public String password;

}
