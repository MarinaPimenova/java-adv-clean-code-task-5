package com.hw.fix;

public class SalariedEmployee extends Employee {
    @Override
    public Long calculatePay() {
        return 0L;
    }

    @Override
    public Long calculateBonus() {
        return 0L;
    }
}
