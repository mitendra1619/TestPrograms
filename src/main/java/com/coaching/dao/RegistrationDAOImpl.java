package com.coaching.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coaching.model.StudentEntity;
import com.coaching.model.SubjectEntity;
import com.coaching.model.TeacherEntity;

@Repository("registrationDAO")
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO {

	@PersistenceContext
    private EntityManager manager;
	
	public List getAllStudents() {
	
		return null;
	}

	public List getAllTeachers() {
		
		return null;
	}


	public void addStuent(StudentEntity stu) {
		manager.persist(stu);
		
	}

	public void addTeacher(TeacherEntity tchr) {
		
		
	}
	
	public List<SubjectEntity> getAllSubjects(){
        List<SubjectEntity> subjectEntity = manager.createQuery("SELECT se FROM Subject_Entity se  ORDER BY se.sub_id ASC")
                .getResultList();
        return subjectEntity;
    }

	
}
