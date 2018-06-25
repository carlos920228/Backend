package com.softlution.test.modelo;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="personas")
@Access(AccessType.FIELD)
public class Personas implements Serializable{
	private static final long serialVersionUID = 8799656478674716638L;

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idpersonas",unique = true, nullable=false)
private Long id;

@Column(name="name", length=45)
private String name;    

@Column(name="last_name",length=45)
private String lastName;  

@Column(name="email", length=45)
private String email;

@Column(name="telephone", length=45)
private String telephone;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public void setId(Long id) {
	this.id= id;
}
public Long getId() {
	return id;
}
}
