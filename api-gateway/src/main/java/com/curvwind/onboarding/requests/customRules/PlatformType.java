package com.curvwind.onboarding.requests.customRules;

import com.curvwind.onboarding.requests.customRulesImpl.PlatformTypeImpl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PlatformTypeImpl.class)
@Documented
public @interface PlatformType {

    String message() default "Platform type must be web or mobile.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}