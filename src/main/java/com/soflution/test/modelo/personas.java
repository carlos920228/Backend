package com.soflution.test.modelo;

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
public class personas implements Serializable{
	private static final long serialVersionUID = 8799656478674716638L;

@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private Long id;

@Column(name="name", length=45)
private String name;    

@Column(name="last_name",length=45)
private String lastName;  

@Column(name="email", length=45)
private String email;

@Column(name="telephone", length=45)
private String telephone;

}
