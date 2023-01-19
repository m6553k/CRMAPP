package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;

public interface ContactService {
	public void saveClientContact(ClientContacts clientcontactsinfo);
	public Client getClientById(long id);
	List<ClientContacts>  getContacts();

}
