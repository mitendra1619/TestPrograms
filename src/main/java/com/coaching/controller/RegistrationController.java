package com.coaching.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coaching.Model.StudentEntity;
import com.coaching.Model.SubjectEntity;
import com.coaching.service.RegistrationSvc;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationSvc registrationSvc;

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	/**
     * This method will provide the medium to add a new student.
     */
    @RequestMapping(value = { "/newstudent" }, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        StudentEntity stu = new StudentEntity();
        model.addAttribute("student", stu);
        model.addAttribute("edit", false);
        return "registration";
    }
	
    /**
     * This method will be called on form submission
     */
    @RequestMapping(value = { "/addStudent" }, method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") StudentEntity studentEntity, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "registration";
        }
        registrationSvc.addStuent(studentEntity);
 
        model.addAttribute("success", "User " + studentEntity.getName() +  " registered successfully");
        return "registrationsuccess";
    }
    
	/**
     * This method will list all existing users.
     */
    @RequestMapping(value = { "/list" }, method = RequestMethod.GET)
    public String listStudents(ModelMap model) {
 
        /*List<StudentEntity> studentEntitys = registrationSvc.getAllStudents();
        model.addAttribute("student", studentEntitys);*/
        return "userslist";
    }
    
    /**
     * This method will provide SubjectEntity list to views
     */
    @ModelAttribute("roles")
    public List<SubjectEntity> initializeProfiles() {
        return registrationSvc.getAllSubjects();
    }
}
