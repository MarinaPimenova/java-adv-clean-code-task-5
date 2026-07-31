package com.hw.fix;

import com.hw.exception.InvalidEmployeeType;

public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Long calculatePay();

    public abstract Long calculateBonus();

    public Long calculatePay(Employee e) throws InvalidEmployeeType {
        return e.calculatePay();
    }

    public Long calculateBonus(Employee e) throws InvalidEmployeeType {
        return e.calculateBonus();
    }
}
