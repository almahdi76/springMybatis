package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Employee;
import com.hr.repository.EmployeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeMapper employeRepository;
	
	
	
//	public List<Employee> getDepartEmp(long departId){
//		
//		return employeRepository.findByDepartementId(departId);
//	}
//	
//	
//	
//	public List<Employee> getAllEmployes(){
//		
//		return employeRepository.findAll(); 
//	}
//	
//	public Employee getempById(long id){
//		
//		return employeRepository.findById(id).orElseThrow(null); 
//	}
//	
//	public List<Employee> getemplbyname(String firstName){
//		
//		return employeRepository.findByFirstName(firstName) ;
//	}
//	
//	public List<Employee> getemplSerch(String firstName,String lastName){
//		
//		return employeRepository.emplSerch(firstName, lastName) ;
//	}
//	
//	
//	public void addEmpl(Employee newEmp) {
//		employeRepository.save(newEmp);
//	}
//	
//	public void updateEmpl(Employee newEmp) {
//		employeRepository.save(newEmp);
//	}
//	
//	public void deleteEmpl(long id) {
//		employeRepository.deleteById(id);
//	}

}
