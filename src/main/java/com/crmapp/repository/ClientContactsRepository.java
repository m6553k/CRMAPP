package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entities.Client;
import com.crmapp.entities.ClientContacts;

public interface ClientContactsRepository extends JpaRepository<ClientContacts, Long> {

}
