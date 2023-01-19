package com.crmapp.services;

import java.util.List;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;


public interface ClientService {
	public void saveoneClient(Client clientinfo);
	public Client getClientById(long id);
	public void deleteClientById(long id);
	public List<ClientContacts> getAllClients();

	

	

}
