package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class EmpConfig {

    @Bean("emp1")
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Megha");
        employee.setEmpSalary("50000");
        return employee;
    }

    @Bean
    public Department getdepartment(){
        return new Department(1,"sales");
    }
}
