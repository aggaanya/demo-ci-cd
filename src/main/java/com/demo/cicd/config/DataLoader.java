package com.demo.cicd.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.cicd.entity.Employee;
import com.demo.cicd.repository.EmployeeRepository;

/**
 * Configuration class that loads sample employee data on application startup.
 * 
 * Uses CommandLineRunner to insert 5 sample employees into H2 database.
 */
@Configuration
public class DataLoader {

    /**
     * Load sample employees on startup.
     */
    @Bean
    public CommandLineRunner loadSampleData(EmployeeRepository employeeRepository) {
        return args -> {
            // Create 5 sample employees
            employeeRepository.save(new Employee(null, "Alice Johnson", "alice@company.com", "Engineering"));
            employeeRepository.save(new Employee(null, "Bob Smith", "bob@company.com", "Sales"));
            employeeRepository.save(new Employee(null, "Carol White", "carol@company.com", "Engineering"));
            employeeRepository.save(new Employee(null, "David Brown", "david@company.com", "HR"));
            employeeRepository.save(new Employee(null, "Eve Davis", "eve@company.com", "Sales"));

            System.out.println("✓ Sample employee data loaded successfully!");
        };
    }

}

