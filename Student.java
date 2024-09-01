package com.OneToManyStud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class Student {
    
	@Id
	private int sid;
	
	private String sName;
	
	private String addrs;
	
	
	
    @ManyToOne
	private Teacher teacher;



	public void setSid(int i) {
		// TODO Auto-generated method stub
		
	}



	public void setSName(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setAddrs(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setTeacher(Teacher t) {
		// TODO Auto-generated method stub
		
	}



	public char[] getSid() {
		// TODO Auto-generated method stub
		return null;
	}



	public char[] getSName() {
		// TODO Auto-generated method stub
		return null;
	}



	public char[] getAddrs() {
		// TODO Auto-generated method stub
		return null;
	}
}
