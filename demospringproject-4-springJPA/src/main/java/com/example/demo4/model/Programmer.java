package com.example.demo4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity                     // @Entity means > this is database entity
public class Programmer {
	
	@Id                    // @Id means > this is primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // user id will generate automatically 
	private int pId;
	private String pName;
	private String pLang;
	
	
	public Programmer() {
		super();

	}

	public Programmer(int pId, String pName, String pLang) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pLang = pLang;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpLang() {
		return pLang;
	}

	public void setpLang(String pLang) {
		this.pLang = pLang;
	}

	@Override
	public String toString() {
		return "Programmer [pId=" + pId + ", pName=" + pName + ", pLang=" + pLang + "]";
	}
	
	
	
	
	

}
