package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
@Autowired
UserDAO userDAO;
    @RequestMapping(value="/")
    public String home()
    {
    	return "Home";
    
    }
	@RequestMapping(value="isValidUser")
	public ModelAndView showMessage(@RequestParam(value="name")String name,@RequestParam(value = "password" )String password)
 	
	{
  System.out.println("in controller");
  String message;
  if(userDAO.isValidUser(name,password))
		  {
	       message="Valid Credentials";
	       System.out.println("hi");
	       ModelAndView mv= new ModelAndView("index");
	       return mv;
	     	}
	       
		  
  else
  {
	  message="Invalid Credentials";
	  System.out.println("bye");
      ModelAndView mc= new ModelAndView("Error");
      return mc;
	  
  } 

}}