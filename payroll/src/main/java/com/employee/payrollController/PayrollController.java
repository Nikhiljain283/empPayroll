package com.employee.payrollController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.employee.payrollModel.PayrollModel;
import com.employee.payrollService.PayrollService;

@RestController
public class PayrollController {

	PayrollService service = new PayrollService();

	@GetMapping("/greeting")
	public String greet() {
		String response = service.doGreet();
		return response;
	}

	@PostMapping("/adding")
	public String add(@RequestHeader String firstName, @RequestHeader String lastName) {
		String response = "hii...  " + firstName + " " + lastName;
		return response;

	}

	@PostMapping("/addingDb")
	public PayrollModel add1(@RequestBody PayrollModel data) {
		PayrollModel response = service.addDb(data);
		return response;
	}
}
