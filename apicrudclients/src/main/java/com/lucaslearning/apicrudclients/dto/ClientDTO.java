package com.lucaslearning.apicrudclients.dto;

import java.io.Serializable;
import java.time.Instant;

import com.lucaslearning.apicrudclients.entities.Client;

public class ClientDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String cpf;
	private Integer children;
	private Double income;
	private Instant birthDate;

	public ClientDTO() {

	}

	public ClientDTO(Long id, String name, String cpf, Integer children, Double income, Instant birthDate) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.setChildren(children);
		this.income = income;
		this.birthDate = birthDate;
	}

	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.setChildren(entity.getChildren());
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

}
