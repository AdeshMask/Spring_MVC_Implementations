package springmvc.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home") 
	public String home(Model model) {
		System.out.println("this is home URL");
		System.out.println("Sending data(dynamically) from Controler to View by using Model");
		model.addAttribute("name", "Adesh Maske");
		model.addAttribute("id",70383);
		
		List<String> friends = new ArrayList<String>(); 
		friends.add("Adesh");
		friends.add("Saurabh");
		
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Sending data(dynamically) from Controler to View by using Model and View");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Adesh Maske");
		modelAndView.setViewName("help");
		
		modelAndView.addObject("Id", 123212);
//		List<String> friends = new ArrayList<String>();
//		friends.add("Saurabh");
//		friends.add("Kiran");
//		
//		modelAndView.addObject("f", friends);
//		LocalDateTime time = LocalDateTime.now();
//		modelAndView.addObject("time", time);
		System.out.println("Feteching data by using JSP expression");
		
		modelAndView.addObject("friend", "Ganesh");
		modelAndView.addObject("id", 32123);
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		modelAndView.addObject("numbers", list);
		return modelAndView;
	}
}

