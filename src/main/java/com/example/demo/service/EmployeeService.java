package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService
{
	@Autowired
    private EmployeeRepository repo;
     
    public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public void save(Employee emp) {
        repo.save(emp);
    }
     
    public Employee get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	
	
	
}
