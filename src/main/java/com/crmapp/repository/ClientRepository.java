package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
