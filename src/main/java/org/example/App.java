package org.example;

import org.example.config.EmpConfig;
import org.example.domain.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
        Employee emp = context.getBean("emp1",Employee.class);
        System.out.println(emp);
    }
}
