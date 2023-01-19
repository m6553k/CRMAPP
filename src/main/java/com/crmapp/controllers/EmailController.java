package com.crmapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailserviceprovider;
	
	@RequestMapping(value="/composeEmail",method=RequestMethod.POST)
	public String composeEmail(@RequestParam("email")String email,Model show) {
		show.addAttribute("email", email);
		return "compose_email";
	}
		
	@RequestMapping("/sendEmail")	
	public String sendEmail(@RequestParam("to")String to,@RequestParam("sub")String sub,@RequestParam("msg") String msg,Model show) {
		emailserviceprovider.sendEmail(to, sub, msg);
		show.addAttribute("msg", "Email Sent");
		return"compose_email";
	}
		
	}

