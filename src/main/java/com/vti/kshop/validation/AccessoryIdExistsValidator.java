package com.vti.kshop.validation;

import com.vti.kshop.repository.AccessoryRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccessoryIdExistsValidator implements ConstraintValidator<AccessoryExists, Long> {
    private final AccessoryRepository accessoryRepository;

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext context) {
        return accessoryRepository.existsById(id);
    }
}