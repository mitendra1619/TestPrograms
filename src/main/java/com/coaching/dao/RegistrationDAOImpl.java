package com.coaching.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coaching.Model.StudentEntity;
import com.coaching.Model.SubjectEntity;
import com.coaching.Model.TeacherEntity;

@Repository("registrationDAO")
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO {

	@PersistenceContext
    private EntityManager manager;
	
	public List getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}


	public void addStuent(StudentEntity stu) {
		manager.persist(stu);
		
	}

	public void addTeacher(TeacherEntity tchr) {
		// TODO Auto-generated method stub
		
	}
	
	public List<SubjectEntity> getAllSubjects(){
        List<SubjectEntity> subjectEntity = manager.createQuery("SELECT se FROM Subject_Entity se  ORDER BY se.sub_id ASC")
                .getResultList();
        return subjectEntity;
    }

	
}
