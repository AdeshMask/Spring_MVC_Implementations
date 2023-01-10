package com.userController.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.userController.entity.User;
import com.userController.service.UserService;


@Controller
public class UserRegister {
	
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		System.out.println("Running Home Controller");
		return "Form";
	}
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public String helloUser() {
		System.out.println("Running User Controller");
		return "User";
	}

	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public String form(@ModelAttribute("user")User user,BindingResult result, Model model) {
		System.out.println(user);
		
		if(result.hasErrors()) {
			return "redirect:/hello";
		}
		this.userService.createUser(user);
		return "User";
	}
	
	@ModelAttribute
	public void commonHeader(Model model) {
		model.addAttribute("Header", "Spring MVC");
	}
	
	@RequestMapping("/search/{id}")
	public String findById(@PathVariable("id") int id){
		System.out.println("Searching Record by Id: "+id);
//		RedirectView redirectView = new RedirectView();
		return "Form";
	}
}
