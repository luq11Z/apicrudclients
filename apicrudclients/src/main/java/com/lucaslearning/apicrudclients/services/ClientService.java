package com.lucaslearning.apicrudclients.services;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lucaslearning.apicrudclients.entities.Client;

@Service
public class ClientService {
	
	public List<Client> findAll() {
		Client obj = new Client(1L, "João", "123849128", 500.00, Instant.now(), 2);
		return Arrays.asList(obj);
	}
}
