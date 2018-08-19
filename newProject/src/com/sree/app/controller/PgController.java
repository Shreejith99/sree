package com.sree.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sree.app.Dto.PgDto;
import com.sree.app.service.PgService;

@Controller
@RequestMapping("/")
public class PgController {
	@Autowired
	private PgService pgService;
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public ModelAndView  registerUserData(@ModelAttribute PgDto dto) {
		boolean flag=pgService.registerUser(dto);
		if(flag){
			return new ModelAndView("registerfinished.html");
		}else {
			return new ModelAndView("register.jsp");
		}

	
	}
      
	public ModelAndView loginUser(@ModelAttribute PgDto pgDto){
		//pgDto.setPersonEmailId(personEmailId);
		boolean flag=pgService.logInUser(pgDto);
		if(flag){
			return new ModelAndView("LogInSuccess.html");
		}
		else{
			return  new ModelAndView("register.html");
		}
	}

}