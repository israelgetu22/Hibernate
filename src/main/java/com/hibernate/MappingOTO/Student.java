package com.hibernate.MappingOTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Student {
	
	
	@Id 
	private int sId;
	private String sName;
	private String sDep; 
	
	
	@OneToOne
	private Books books;


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsDep() {
		return sDep;
	}


	public void setsDep(String sDep) {
		this.sDep = sDep;
	}


	public Books getBooks() {
		return books;
	}


	public void setBooks(Books books) {
		this.books = books;
	}
	
	

}
