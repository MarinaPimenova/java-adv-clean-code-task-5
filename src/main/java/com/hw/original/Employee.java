package com.hw.original;

import com.hw.exception.InvalidEmployeeType;

public class Employee {
    private String name;
    private EmployeeType type;

    public Long calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    private Long calculateSalariedPay(Employee e) {
        return 0L;
    }

    private Long calculateHourlyPay(Employee e) {
        return 0L;
    }

    private Long calculateCommissionedPay(Employee e) {
        return 0L;
    }

    public Long calculateBonus(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedBonus(e);
            case HOURLY:
                return calculateHourlyBonus(e);
            case SALARIED:
                return calculateSalariedBonus(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    private Long calculateSalariedBonus(Employee e) {
        return 0L;
    }

    private Long calculateHourlyBonus(Employee e) {
        return 0L;
    }

    private Long calculateCommissionedBonus(Employee e) {
        return 0L;
    }
}

