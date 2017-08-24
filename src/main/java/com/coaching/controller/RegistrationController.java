package com.coaching.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coaching.model.StudentEntity;
import com.coaching.service.RegistrationSvc;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationSvc registrationSvc;

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	/**
     * This method will provide the medium to add a new student.
     */
    @RequestMapping("/newstudent" )
    public ModelAndView  newUser(ModelMap model) {
        /*StudentEntity stu = new StudentEntity();
        model.addAttribute("student", stu);
        model.addAttribute("edit", false);*/
        return new ModelAndView("registration","command",new StudentEntity());
    }
	
    /**
     * This method will be called on form submission
     */
    @RequestMapping(value = { "/addStudent" }, method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute("student") StudentEntity studentEntity) {
 
        /*if (result.hasErrors()) {
            return "registration";
        }
        registrationSvc.addStuent(studentEntity);
 
        model.addAttribute("success", "User " + studentEntity.getName() +  " registered successfully");
        return "registrationsuccess";*/
    	
    	//write code to save studentEntity object  
        //here, we are displaying studentEntity object to prove studentEntity has data  
        System.out.println(studentEntity.getName());  
          
        //return new ModelAndView("registration","command",studentEntity);//will display object data  
        return new ModelAndView("redirect:/viewstu");//will redirect to viewstu request mapping 
    }
    
	/**
     * This method will list all existing users.
     */
    @RequestMapping("/viewstu")
    public ModelAndView listStudents() {
 
        /*List<StudentEntity> studentEntitys = registrationSvc.getAllStudents();
        model.addAttribute("student", studentEntitys);*/
    	List<StudentEntity> list=new ArrayList<StudentEntity>();  
        list.add(new StudentEntity("Abhishek Engineer"));  
        list.add(new StudentEntity("Manish Manager"));  
        list.add(new StudentEntity("Honey P Manger"));  
          
        return new ModelAndView("viewstu","list",list); 
        //return "userslist";
    }
    
    /**
     * This method will provide SubjectEntity list to views
     */
    /*@ModelAttribute("roles")
    public List<SubjectEntity> initializeProfiles() {
        return registrationSvc.getAllSubjects();
    }*/
}
