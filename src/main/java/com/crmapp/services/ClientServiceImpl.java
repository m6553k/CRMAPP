package com.crmapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;
import com.crmapp.repository.ClientRepository;


@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientrepo;
	

	@Override
	public void saveoneClient(Client clientinfo) {
		clientrepo.save(clientinfo);

	}


	@Override
	public Client getClientById(long id) {
		Optional<Client>findById=clientrepo.findById(id);
		Client  clientinfo=findById.get();
		return clientinfo;
	}


	@Override
	public void deleteClientById(long id) {
		clientrepo.deleteById(id);
	}


	@Override
	public List<ClientContacts> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

}
