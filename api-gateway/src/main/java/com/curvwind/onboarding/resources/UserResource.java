package com.curvwind.onboarding.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResource {
    public Integer id;
    public String userName;
    public String email;
    public String phone;
    public LocalDate dob;
    public Arrays details;
}
