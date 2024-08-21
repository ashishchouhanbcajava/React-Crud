package com.Rest.RestCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.RestCrud.Employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
