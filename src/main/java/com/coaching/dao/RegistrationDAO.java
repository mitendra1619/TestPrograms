package com.coaching.dao;

import java.util.List;

import com.coaching.model.StudentEntity;
import com.coaching.model.SubjectEntity;
import com.coaching.model.TeacherEntity;
import com.coaching.travelObject.StudentTO;
import com.coaching.travelObject.TeacherTO;

public interface RegistrationDAO {

	public List<StudentTO> getAllStudents();
    public List<TeacherTO> getAllTeachers();
    public void addStuent(StudentEntity stu);
    public void addTeacher(TeacherEntity tchr);
    public List<SubjectEntity> getAllSubjects();
}
