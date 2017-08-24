package com.coaching.service;

import java.util.List;

import com.coaching.model.StudentEntity;
import com.coaching.model.SubjectEntity;
import com.coaching.model.TeacherEntity;

public interface RegistrationSvc {

	/**
	 * 
	 * @return
	 */
	public List getAllStudents();
    
	/**
	 * 
	 * @return
	 */
	public List getAllTeachers();
    
	/**
	 * 
	 * @return
	 */
	public void addStuent(StudentEntity stu);
    
	/**
	 * 
	 * @return
	 */
	public void addTeacher(TeacherEntity tchr);
	
	/**
	 * 
	 * @return
	 */
	public List<SubjectEntity>  getAllSubjects();
}
