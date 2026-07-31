package com.hw.fix;

public class CommissionedEmployee extends Employee {
    @Override
    public Long calculatePay() {
        return 0L;
    }

    @Override
    public Long calculateBonus() {
        return 0L;
    }
}
