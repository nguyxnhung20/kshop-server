package com.vti.kshop.validation;

import com.vti.kshop.entity.Car;
import com.vti.kshop.repository.CarRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarPkExistsValidator implements ConstraintValidator<CarPkExists, Car.PrimaryKey> {
    private final CarRepository carRepository;

    @Override
    public boolean isValid(Car.PrimaryKey pk, ConstraintValidatorContext context) {
        return carRepository.existsById(pk);
    }
}