package com.coaching.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
	@Table(name = "SUBJECT")
	public class SubjectEntity {
	 
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "ID")
	    private long id;
	 
	    @Column(name = "NAME")
	    private String name;
	     
	     
	    @ManyToMany(mappedBy="subjects")
	    private List<StudentEntity> students = new ArrayList<StudentEntity>();
	     
	     public SubjectEntity() {
		} 
	     
	    public SubjectEntity(String name){
	        this.name = name;
	    }
}
