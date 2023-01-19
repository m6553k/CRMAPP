package com.crmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;
import com.crmapp.repository.ClientContactsRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ClientContactsRepository clientcontactrepo;
	
	@Override
	public void saveClientContact(ClientContacts clientcontactsinfo) {
		clientcontactrepo.save(clientcontactsinfo);
	}

	@Override
	public Client getClientById(long id) {
	Optional<ClientContacts> findById = clientcontactrepo.findById(id);
	ClientContacts clientcontactsinfo=findById.get();
	return null;
	}

	@Override
	public List<ClientContacts> getContacts() {
		List<ClientContacts> clientcontactsinfo=clientcontactrepo.findAll();
		return clientcontactsinfo;
	}

}
