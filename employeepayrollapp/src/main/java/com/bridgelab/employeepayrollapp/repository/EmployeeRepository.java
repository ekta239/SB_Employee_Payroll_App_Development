package com.bridgelab.employeepayrollapp.repository;

import com.bridgelab.employeepayrollapp.model.EmployeePayRoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayRoll, Integer> {
}
