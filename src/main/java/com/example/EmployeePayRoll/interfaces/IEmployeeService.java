package com.example.EmployeePayRoll.interfaces;

import com.example.EmployeePayRoll.dto.EmployeeDTO;
import com.example.EmployeePayRoll.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(EmployeeDTO employeeDTO);
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}
