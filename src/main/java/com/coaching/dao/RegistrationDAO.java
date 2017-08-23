package com.coaching.dao;

import java.util.List;

import com.coaching.Model.StudentEntity;
import com.coaching.Model.SubjectEntity;
import com.coaching.Model.TeacherEntity;

public interface RegistrationDAO {

	public List getAllStudents();
    public List getAllTeachers();
    public void addStuent(StudentEntity stu);
    public void addTeacher(TeacherEntity tchr);
    public List<SubjectEntity> getAllSubjects();
}
