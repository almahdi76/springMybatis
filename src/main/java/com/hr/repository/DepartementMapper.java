package com.hr.repository;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.hr.model.Departement;

@Mapper
public interface DepartementMapper  {
	
	//@Select("select depar_name departementName,id id from name_departements")// nomTable nomEnClass from name of  t
	@Select("select depar_name , id from name_departements")
	@Results(value= {
			@Result(property="departementName",column="depar_name"),
	})
			
	public List<Departement> getAll();
	
	
	@Insert("insert into name_departements(id,depar_name) values (#{id},#{departementName});")
	void insert(Departement deprt);
	
	
	void update();
	void delete();

	

	
	

}
