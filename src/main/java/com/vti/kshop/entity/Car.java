package com.vti.kshop.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @EmbeddedId
    private PrimaryKey pk;

    @Column(name = "customer_name", nullable = false, length = 50)
    private String customerName;

    @Column(name = "catalogs", nullable = false, length = 50)
    private String catalogs;

    @Column(name = "car_maker", nullable = false, length = 50)
    private String carMaker;

    @Getter
    @Setter
    @EqualsAndHashCode
    @Embeddable
    public static class PrimaryKey {
        @Column(name = "license_plate", length = 10, nullable = false)
        private String licensePlate;

        @Column(name = "repair_date", nullable = false)
        private LocalDate repairDate;
    }
}
