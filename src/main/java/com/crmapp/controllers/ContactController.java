package com.crmapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmapp.entities.ClientContacts;
import com.crmapp.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactserviceinfo;
	
	@RequestMapping("/listcontacts")
	public String listContacts(Model show) {
		List<ClientContacts> contacts = contactserviceinfo.getContacts();
		show.addAttribute("contacts", contacts);
		return "list_contacts";
	}

}
