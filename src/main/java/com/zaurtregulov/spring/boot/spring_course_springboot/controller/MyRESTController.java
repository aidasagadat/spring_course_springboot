package com.zaurtregulov.spring.boot.spring_course_springboot.controller;


import com.zaurtregulov.spring.boot.spring_course_springboot.entity.Employee;
import com.zaurtregulov.spring.boot.spring_course_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }


 //
//
//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//
//        if(employee == null){
//            throw new NoSuchEmployeeException("Employee with id " + id + " not found");
//        }
//
//        return employee;
//
//    }
//
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee){
//
//        employeeService.saveEmployee(employee);
//        return employee;
//
//    }
//
//
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//
//        employeeService.saveEmployee(employee);
//
//        return employee;
//
//    }
//
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id){
//
//        Employee employee = employeeService.getEmployee(id);
//
//        if(employee == null){
//            throw new NoSuchEmployeeException("Employee with id " + id + " does not exist");
//        }
//
//
//        employeeService.deleteEmployee(id);
//
//        String message = "Employee with id " + id + " was deleted";
//
//        return message;
//
//    }


}





















