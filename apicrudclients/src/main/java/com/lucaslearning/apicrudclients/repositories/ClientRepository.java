package com.lucaslearning.apicrudclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucaslearning.apicrudclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
