package com.employee.payrollRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.payrollModel.PayrollModel;

public interface PayrollRepository extends JpaRepository<PayrollModel, Integer> {

}
