package com.demo.cicd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.cicd.entity.Employee;

/**
 * Spring Data JPA Repository for Employee entity.
 * 
 * Provides CRUD operations and custom queries for employees.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**
     * Find all employees in a specific department.
     * 
     * @param department the department name
     * @return list of employees in that department
     */
    List<Employee> findByDepartment(String department);

}

