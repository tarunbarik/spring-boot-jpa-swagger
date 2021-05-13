package com.app.swagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.swagger.model.Employee;

/**
 * @author Tarun
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
