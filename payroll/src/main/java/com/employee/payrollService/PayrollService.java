package com.employee.payrollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.payrollModel.PayrollModel;

@Service
public class PayrollService {

	@Autowired
	PayrollModel repo;

	public String doGreet() {
		return "Welcome to employee payroll";
	}

	public PayrollModel addDb(PayrollModel data) {
		PayrollModel model = new PayrollModel(data);
		repo.save(model);
		return model;
	}

}
