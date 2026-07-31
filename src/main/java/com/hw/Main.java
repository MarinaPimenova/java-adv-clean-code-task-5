package com.hw;

import com.hw.fix.CommissionedEmployee;
import com.hw.fix.HourlyEmployee;
import com.hw.fix.SalariedEmployee;
import com.hw.original.Employee;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee originalEmployee = new Employee();
        // fix approach
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        List<com.hw.fix.Employee> employees = List.of(commissionedEmployee, hourlyEmployee, salariedEmployee);

        employees.forEach(employee -> {
            employee.calculatePay(employee);
            employee.calculateBonus(employee);
        });
    }
}