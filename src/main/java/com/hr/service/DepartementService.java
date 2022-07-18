package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Departement;

import com.hr.repository.DepartementMapper;

@Service
public class DepartementService {
	@Autowired
	private  DepartementMapper departementMapper;
	
	


	public List<Departement> getAllDepartement(){
		
		return departementMapper.getAll();
	}
//	
//	public Departement getDepartById(long id){
//		
//		return departementRepository.findById(id).orElseThrow(null); 
//	}
//	
//	
////	public List<Departement> getDepartSerchId(Long departId){
////		
////		return departementRepository.DepartSerchId(departId);
////	}
//	
//	
	public void addDepart(Departement newDepart) {
		departementMapper.insert(newDepart);
	}
//	
//	public void updateDepart(Departement newDepart) {
//		departementRepository.save(newDepart);
//	}
//	
//	public void deleteDepart(long id) {
//		departementRepository.deleteById(id);
//	}
//	
	
	
	
}
