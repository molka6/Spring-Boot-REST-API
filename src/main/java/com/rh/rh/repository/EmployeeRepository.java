package com.rh.rh.repository;
import org.springframework.data.repository.CrudRepository;

import com.rh.rh.model.Employee;

import org.springframework.stereotype.Repository;


@Repository



public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}
