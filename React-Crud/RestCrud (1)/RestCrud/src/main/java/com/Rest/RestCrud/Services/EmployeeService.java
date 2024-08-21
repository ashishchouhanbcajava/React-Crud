package com.Rest.RestCrud.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Rest.RestCrud.Employee.Employee;
import com.Rest.RestCrud.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		// TODO Auto-generated constructor stub
		this.employeeRepository = employeeRepository;
	}

	public Employee save(Employee employee) {
		Employee save = this.employeeRepository.save(employee);
		return save;

	}

	public List<Employee> getAll() {
		return this.employeeRepository.findAll();
	}

	public Employee getEmp(Long id) {
		return this.employeeRepository.findById(id).get();
	}

	public void deleteEmp(Long id) {
		this.employeeRepository.deleteById(id);

	}

}
