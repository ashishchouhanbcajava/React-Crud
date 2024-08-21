package com.Rest.RestCrud.RestControllers;

import java.util.Base64;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.RestCrud.Employee.Employee;
import com.Rest.RestCrud.Services.EmployeeService;

import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController
public class RestControllers {
	private EmployeeService employeeService;

	public RestControllers(EmployeeService employeeService) {
		// TODO Auto-generated constructor stub
		this.employeeService = employeeService;
	}

	@PostMapping("/Add")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
//		System.out.println(employee.getAddress());
////		for (Address address : employee.getAddress()) {
////			address.setEmployee(employee);
////
////		}
//		System.out.println("by javascript");
////		Address address = employee.getAddress();
//		address.setEmployee(employee);
		System.out.println(employee.getProfilePic());
		employee.setIsChecked(true);
		Employee save = this.employeeService.save(employee);

		if (save != null) {
			return ResponseEntity.ok(save);

		} else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}
		
		
	}
	
	
	

	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> all = this.employeeService.getAll();
		if (all != null) {
			return ResponseEntity.ok(all);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmp(@PathVariable Long id) {

		Employee emp = this.employeeService.getEmp(id);
		if (emp != null) {
			return ResponseEntity.ok(emp);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable("id") Long id) {
		this.employeeService.deleteEmp(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmp(@PathVariable("id") Long id, @RequestBody Employee employee) {
		Employee emp = this.employeeService.getEmp(id);
		if (emp != null) {
			emp.setName(employee.getName());
			emp.setDepartment(employee.getDepartment());
			emp.setDesignation(employee.getDesignation());
			emp.setPassword(employee.getPassword());
//			Address neww = employee.getAddress();

////			Address old = emp.getAddress();
//			old.setCountry(neww.getCountry());
//			old.setDistrict(neww.getDistrict());
//			old.setState(neww.getState());
//			old.setVillage(neww.getVillage());

			emp.setId(id);
			Employee save = this.employeeService.save(emp);
			if (save != null) {
				return ResponseEntity.ok(save);
			}

		}
		return ResponseEntity.status(HttpStatus.CONFLICT).build();

	}

	@PostMapping("/EnabledandDisabled")
	public ResponseEntity<String> toggleEnabled(@RequestBody Employee employee) {
		System.out.println(employee.getId());
		Employee existingUser = employeeService.getEmp(employee.getId());
		if (existingUser != null) {
			System.out.println(employee.getIsChecked());
			existingUser.setIsChecked(employee.getIsChecked());
			employeeService.save(existingUser);

			return ResponseEntity.ok("success");
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
	}
}
