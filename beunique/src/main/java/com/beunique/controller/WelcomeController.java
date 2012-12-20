package com.beunique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}

	@RequestMapping("/add")
	public ModelAndView add(ModelMap model) throws Exception {

		model.addAttribute("message", "print add");
		return new ModelAndView("index");

	}

	@RequestMapping("/delete")
	public ModelAndView delete(ModelMap model) throws Exception {

		model.addAttribute("message", "print delete");
		return new ModelAndView("index");

	}
}
