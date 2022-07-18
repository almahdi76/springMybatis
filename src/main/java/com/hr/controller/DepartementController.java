package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Departement;

import com.hr.service.DepartementService;

@RestController
@RequestMapping("/api/v1")
public class DepartementController {
	
	@Autowired
	private  DepartementService departementService;
	



	
	@GetMapping("/departement")
	public List<Departement> getAllDepartement(){
		
		return departementService.getAllDepartement();
	}
	
//	@GetMapping("/getDepartbyid")
//	public Departement getDepartById(@RequestParam long id){
//		
//		return departementService.getDepartById(id);
//	}
//
//	
	@PostMapping("/departement")
	public String addDepart(@RequestBody Departement newDepart) {
		departementService.addDepart(newDepart);
		return "bien ajouter newDepart";
	}
//	
//	@PutMapping("/departement")
//	public String updateDepart(@RequestBody Departement newDepart) {
//		departementService.updateDepart(newDepart);
//		return "bien modifier newDepart";
//	}
//	
//	@DeleteMapping("/departement")
//	public String deleteEmpl(@RequestParam long id) {
//		departementService.deleteDepart(id);
//		return "bien supprimer";
//	}
//	

}
