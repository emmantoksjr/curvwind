package com.curvwind.onboarding.requests.customRulesImpl;

import com.curvwind.onboarding.requests.customRules.PlatformType;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlatformTypeImpl implements ConstraintValidator<PlatformType, String> {

    private final List<String> PlatformType  = Arrays.asList("web", "mobile");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return PlatformType.contains(value);
    }

}