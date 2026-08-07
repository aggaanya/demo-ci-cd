package com.demo.cicd.service;

import java.util.List;

import com.demo.cicd.entity.Employee;

/**
 * Service interface for Employee business logic.
 * 
 * Defines contract for employee operations.
 */
public interface EmployeeService {

    /**
     * Get all employees.
     */
    List<Employee> getAllEmployees();

    /**
     * Get employee by id.
     * 
     * @param id the employee id
     * @return the employee
     * @throws RuntimeException if employee not found
     */
    Employee getEmployeeById(Long id);

    /**
     * Create a new employee.
     * 
     * @param employee the employee to create
     * @return the created employee
     */
    Employee createEmployee(Employee employee);

    /**
     * Update an existing employee.
     * 
     * @param id the employee id
     * @param employee the updated employee data
     * @return the updated employee
     * @throws RuntimeException if employee not found
     */
    Employee updateEmployee(Long id, Employee employee);

    /**
     * Delete an employee.
     * 
     * @param id the employee id
     * @throws RuntimeException if employee not found
     */
    void deleteEmployee(Long id);

    /**
     * Find employees by department.
     * 
     * @param department the department name
     * @return list of employees in that department
     */
    List<Employee> findByDepartment(String department);

}

