package com.lucaslearning.apicrudclients.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaslearning.apicrudclients.entities.Client;
import com.lucaslearning.apicrudclients.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	
	public List<Client> findAll() {
		List<Client> list = repository.findAll();
		return list;
	}
}
