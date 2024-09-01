package com.OneToManyStud;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Teacher {
     @Id
	private int tid;
     
     private String tname;
     
     @OneToMany(mappedBy = "teacher")
	private List<Student> student;
	

	public void setTid(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setTname(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getTid() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getTname() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}
}
