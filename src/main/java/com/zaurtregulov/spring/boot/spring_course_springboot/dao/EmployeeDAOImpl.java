package com.zaurtregulov.spring.boot.spring_course_springboot.dao;


import com.zaurtregulov.spring.boot.spring_course_springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;

    }

    @Override
    public void saveEmployee(@ModelAttribute Employee employee) {

        Employee emp = entityManager.merge(employee);

        employee.setId(emp.getId());


    }

    @Override
    public Employee getEmployee(int id) {

        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {

        Query query = entityManager.createQuery("delete from Employee " + "where id=:empId");
        query.setParameter("empId", id);
        query.executeUpdate();



    }
}
