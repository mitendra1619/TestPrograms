package com.coaching.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "STUDENT_ID")
	private int sid;
	
	
	@NotEmpty
    @Column(name="FIRST_NAME")
    private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_SUBJECTID", joinColumns={@JoinColumn(name="STUDENT_ID")}, 
				inverseJoinColumns={@JoinColumn(name="SUBJECT_ID")})
	private Set<SubjectEntity> subjects = new HashSet<SubjectEntity>();

	
	public StudentEntity() {
	}

	public StudentEntity(String name) {
        this.name = name;
    }
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SubjectEntity> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectEntity> subjects) {
		this.subjects = subjects;
	}

	
}
