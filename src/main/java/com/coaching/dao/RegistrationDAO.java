package com.coaching.dao;

import java.util.List;

import com.coaching.model.StudentEntity;
import com.coaching.model.SubjectEntity;
import com.coaching.model.TeacherEntity;

public interface RegistrationDAO {

	public List getAllStudents();
    public List getAllTeachers();
    public void addStuent(StudentEntity stu);
    public void addTeacher(TeacherEntity tchr);
    public List<SubjectEntity> getAllSubjects();
}
