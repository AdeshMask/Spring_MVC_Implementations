package viewtocontroller.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import viewtocontroller.model.User;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		
		System.out.println("Running Home Controller");
		return "form";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String form(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println("Email id is " + email);
//		return "processform";
//	}
	public String form(@ModelAttribute("user") User user, Model model) {
		
		System.out.println(user);
//		model.addAttribute("user",user);
		return "processform";
	}
	
//	@RequestMapping("/header")
//	public String forHeader(Model model) {
//		model.addAttribute("Header", "Spring MVC");
//		return "form";
//	}
	
	@ModelAttribute
	public void commonHeader(Model model) {
		model.addAttribute("Header", "Spring MVC");
	}
	
	/*
// Model is used for sending data from view to controller
	 * 
	 * public String form(@RequestParam("email") String
	 * email, @RequestParam("username") String userName,
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * 
	 * User user = new User(); user.setEmail(email); user.setUserName(userName);
	 * user.setPassword(password);
	 * 
	 * System.out.println(user);
	 * 
	 * // model.addAttribute("email", email); // model.addAttribute("userName",
	 * userName); // model.addAttribute("password", password);
	 * model.addAttribute("user", user); return "processform"; }
	 */

}
