/*package com.slokam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.dao.EmployeeDao;
import com.slokam.dao.EmployeeRepository;
import com.slokam.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empdao;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee>getAll(){
		
		System.out.println("iam in EmployeeService class ");
		
		List<Employee> list = empdao.findAll();
		return list;
		
		
	}
	
	public Employee save(Employee employee){
		
		Employee emp = empdao.save(employee);
		
		return emp;
		
		
		
	}
public Employee update(Employee employee){
		
		Employee emp = empdao.save(employee);
		
		return emp;
		
		
		
	}
	public void delete(@RequestBody Employee employee){
	 empdao.delete(employee);	
	}
	
public Employee getStudentById(Integer id){
	
	Employee emp = empdao.getOne(id);
	
	return emp;
		
}
  public  Page<Employee> listAllByPage(Pageable pagable){
	  
	  return employeeRepository.findAll(pagable);
	  	
}	
	
	
}
*/