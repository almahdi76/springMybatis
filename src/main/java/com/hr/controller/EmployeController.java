package com.hr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//@GetMapping("/employee")
//	public List<Employee> getAllEmployees(){
//		
//		return employeeService.getAllEmployes();
//	}
//	
//	@GetMapping("/departement/{departId}/employee")
//	public List<Employee> getdepartEmpl(@PathVariable long departId){
//		
//		return employeeService.getDepartEmp(departId);
//	}
//	
//	
//	@GetMapping("/getempbyid")
//	public Employee getEmplById(@RequestParam long id){
//		
//		return employeeService.getempById(id);
//	}
//	
//	@GetMapping("/getempbyfirstName")
//	public List<Employee> getEmplByFirstName(@RequestParam String firstName){
//		
//		return employeeService.getemplbyname(firstName);
//	}
//	
//	@GetMapping("/empserch")
//	public List<Employee> empSerch(@RequestParam String firstName,@RequestParam String lastName){
//		
//		return employeeService.getemplSerch(firstName, lastName);
//	}
//	
//	@PostMapping("/employee")
//	public String addEmpl(@RequestBody Employee newEmpl) {
//		employeeService.addEmpl(newEmpl);
//		return "bien ajouter";
//	}
//	
////	@PostMapping("/departement/{departId}/employee")
////	public String addEmpl(@RequestBody Employee newEmpl,@PathVariable long departId) {
////		employeeService.addEmpl(newEmpl);
////		return "bien ajouter";
////	}
//	
//	@PutMapping("/employee")
//	public String updateEmpl(@RequestBody Employee newEmpl) {
//		employeeService.updateEmpl(newEmpl);
//		return "bien modifier";
//	}
//	
//	@DeleteMapping("/employee")
//	public String deleteEmpl(@RequestParam long id) {
//		employeeService.deleteEmpl(id);
//		return "bien supprimer";
//	}

}
