package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.entity.UserEntity;

@Controller
public class UserController {
	
	@RequestMapping("/one")
	public String first() {
		System.out.println("This is first page");
//		RedirectView redirect = new RedirectView();
//		redirect.setUrl("new");
		return "index";
	}
	
	@RequestMapping("/two")
	public String second() {
		System.out.println("This is Second page");
//		RedirectView redirect = new RedirectView();
//		redirect.setUrl("new");
		return "Welcome";
	}

	@RequestMapping("/new")
	public String hello(@ModelAttribute UserEntity user, Model model) {
		System.out.println(user);
		if(user.getName().isBlank()) {
		System.out.println("This is new Page");
			return "redirect:/one";
		}
			return "redirect:/two";
	}
}
