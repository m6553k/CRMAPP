package com.crmapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;
import com.crmapp.services.ClientService;
import com.crmapp.services.ContactService;

@Controller
public class ClientController {
	
	//	http://localhost:8080/createClient
	
	@Autowired
	private ClientService clientinfoService;
	
	@Autowired
	private ContactService contactserviceinfo;

	@RequestMapping(value="/createClient",method = RequestMethod.GET)
	public String ViewCreateClientForm() {
		return "create_clientinfo";
	}
	
	@RequestMapping(value="/saveClient",method=RequestMethod.POST)
	public String saveClient(@ModelAttribute("clientinfo")Client clientinfo,Model show) {
		clientinfoService.saveoneClient(clientinfo);
		show.addAttribute("clientinfo",clientinfo);
		return "client_info";
	}
	@RequestMapping("/convertClient")
	public String convertClient(@RequestParam("id")long id,Model show) {
		Client clientinfo = clientinfoService.getClientById(id);
		
		ClientContacts clientcontactsinfo=new ClientContacts();
		clientcontactsinfo.setfirstname(clientinfo.getfirstname());
		clientcontactsinfo.setlastname(clientinfo.getlastname());
		clientcontactsinfo.setEmail(clientinfo.getemail());
		clientcontactsinfo.setmobile(clientinfo.getmobile());
		clientcontactsinfo.setsource(clientinfo.getsource());
		contactserviceinfo.saveClientContact(clientcontactsinfo);
		List<ClientContacts> contacts = contactserviceinfo.getContacts();
		show.addAttribute("contacts", contacts;
		clientinfoService.deleteClientById(id);
		return "list_clients";
	}
	@RequestMapping("/listclients")
	public String listClientContacts(Model show) {
		List<ClientContacts> clientcontacts =clientinfoService.getAllClients();
		show.addAttribute("clientcontacts", clientcontacts);
		return "list_clients";
	}
	
	@RequestMapping("/clientinfo")
	public String clientInfo(@RequestParam("id")long id,Model show) {
		Client clientinfo = clientinfoService.getClientById(id);
		show.addAttribute("clientinfo", clientinfo);
		return "client_info";
	}
}

