package com.vti.kshop.repository;

import com.vti.kshop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {
}
