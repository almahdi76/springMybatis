package com.hr.model;




public class Departement {
	

	private long id;
	
	
	private String departementName;

	public Departement() {
		
	}

	public Departement(long id, String departementName) {
		
		this.id = id;
		this.departementName = departementName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartementName() {
		return departementName;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}
	

}
