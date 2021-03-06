
package com.srccodes.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCHelloController {

	@RequestMapping("/")
	public String printHelloWorld(Model model) {       // <-- handler method
		
		model.addAttribute("message", "Hello World!");
		
		return "HelloWorld";				//<- view name
	}
}