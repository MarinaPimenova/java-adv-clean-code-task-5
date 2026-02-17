package com.hw.exception;

import com.hw.original.EmployeeType;

public class InvalidEmployeeType extends RuntimeException{
    public InvalidEmployeeType(EmployeeType type) {
    }
}
