package com.bridgelab.employeepayrollapp.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


public class EmployeeDto {
        @NotEmpty(message = "Name cannot be empty")
        @Pattern(regexp = "^[A-Z][a-zA-Z\\s]+$", message = "Name should start with uppercase")
        public String name;

        @Min(value = 5000, message = "Salary should be at least 5000")
        public long salary;

        public EmployeeDto(String name, long salary) {
            this.name = name;
            this.salary = salary;
        }
}
